package edu.mcc.codeschool.Crud.API.controllers;

import edu.mcc.codeschool.Crud.API.models.Snacks;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1/snacks")
public class SnacksController {
    List<Snacks> snacks = new ArrayList<>();

    @GetMapping()
    public ResponseEntity<List<Snacks>> getAllSnacks() {
        return ResponseEntity.ok(snacks);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Snacks> getSnackbyId(@PathVariable String id) {
        Optional<Snacks> snack = snacks.stream().filter(snacks -> snacks.getId().toString().equals(id)).findFirst();
        if (snack.isPresent()) {
            return ResponseEntity.ok(snack.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Snacks> updateSnacks(@PathVariable String id, @Valid @RequestBody Snacks request) {
        Optional<Snacks> snack = snacks.stream().filter(snacks -> snacks.getId().toString().equals(id)).findFirst();
        if (snack.isPresent()) {
            snacks.remove(snack.get());
            snacks.add(request);
            return ResponseEntity.ok(request);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Snacks> createNewSnack(@Valid @RequestBody Snacks request) {
        request.setId(UUID.randomUUID());
        snacks.add(request);
        return ResponseEntity.ok(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Snacks> deleteSnack(@PathVariable String id) {
        Optional<Snacks> snack = snacks.stream().filter(snacks -> snacks.getId().toString().equals(id)).findFirst();
        if (snack.isPresent()) {
            snacks.remove(snack.get());
            return ResponseEntity.ok(snack.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
