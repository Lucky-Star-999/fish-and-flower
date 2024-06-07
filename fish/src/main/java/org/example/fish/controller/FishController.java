package org.example.fish.controller;

import org.example.fish.model.Fish;
import org.example.fish.service.FishService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fishes")
public class FishController {

    private final FishService fishService;

    public FishController(FishService fishService) {
        this.fishService = fishService;
    }

    @GetMapping
    public List<Fish> getAllProducts() {
        return fishService.findAll();
    }

    @GetMapping("/{id}")
    public Fish getProductById(@PathVariable Long id) {
        return fishService.findById(id);
    }

    @PostMapping
    public Fish createProduct(@RequestBody Fish fish) {
        return fishService.save(fish);
    }

    @PutMapping("/{id}")
    public Fish updateProduct(@PathVariable Long id, @RequestBody Fish fish) {
        fish.setId(id);
        return fishService.save(fish);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        fishService.deleteById(id);
    }
}
