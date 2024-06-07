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
    public List<Fish> getAll() {
        return fishService.findAll();
    }

    @GetMapping("/{id}")
    public Fish getById(@PathVariable Long id) {
        return fishService.findById(id);
    }

    @PostMapping
    public Fish create(@RequestBody Fish fish) {
        return fishService.save(fish);
    }

    @PutMapping("/{id}")
    public Fish update(@PathVariable Long id, @RequestBody Fish fish) {
        fish.setId(id);
        return fishService.save(fish);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        fishService.deleteById(id);
    }
}
