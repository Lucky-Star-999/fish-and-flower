package org.example.flower.controller;

import org.example.flower.model.Flower;
import org.example.flower.service.FlowerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getAll() {
        return flowerService.findAll();
    }

    @GetMapping("/{id}")
    public Flower getById(@PathVariable Long id) {
        return flowerService.findById(id);
    }

    @PostMapping
    public Flower create(@RequestBody Flower flower) {
        return flowerService.save(flower);
    }

    @PutMapping("/{id}")
    public Flower update(@PathVariable Long id, @RequestBody Flower flower) {
        flower.setId(id);
        return flowerService.save(flower);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        flowerService.deleteById(id);
    }
}
