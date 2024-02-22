package edu.mcc.codeschool.Crud.API.controllers;

import edu.mcc.codeschool.Crud.API.models.Plants;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/plants")
public class PlantsController {
    List<Plants> plants = new ArrayList<>();

    @GetMapping()
    public ResponseEntity<List<Plants>> getAllPlants() {
        return ResponseEntity.ok(plants);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plants> getDrinkById(@PathVariable String id) {
        Optional<Plants> plnt = plants.stream().filter(plants -> plants.getId().toString().equals(id)).findFirst();
        if (plnt.isPresent()) {
            return ResponseEntity.ok(plnt.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plants> updatePlants(@PathVariable String id, @Valid @RequestBody Plants request) {
        Optional<Plants> plnt = plants.stream().filter(plants -> plants.getId().toString().equals(id)).findFirst();
        if (plnt.isPresent()) {
            plants.remove(plnt.get());
            plants.add(request);
            return ResponseEntity.ok(request);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Plants> createNewPlant(@Valid @RequestBody Plants request) {
        request.setId(UUID.randomUUID());
        plants.add(request);
        return ResponseEntity.ok(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Plants> deletePlant(@PathVariable String id) {
        Optional<Plants> plnt = plants.stream().filter(plants -> plants.getId().toString().equals(id)).findFirst();
        if (plnt.isPresent()) {
            plants.remove(plnt.get());
            return ResponseEntity.ok(plnt.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
