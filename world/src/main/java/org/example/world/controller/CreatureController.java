package org.example.world.controller;

import org.example.world.model.Creature;
import org.example.world.service.CreatureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/creatures")
public class CreatureController {

    private final CreatureService creatureService;

    public CreatureController(CreatureService creatureService) {
        this.creatureService = creatureService;
    }

    @GetMapping
    public List<Creature> getAll() {
        return creatureService.findAll();
    }

    @GetMapping("/{id}")
    public Creature getById(@PathVariable Long id) {
        return creatureService.findById(id);
    }

    @PostMapping
    public Creature create(@RequestBody Creature creature) {
        return creatureService.save(creature);
    }

    @PutMapping("/{id}")
    public Creature update(@PathVariable Long id, @RequestBody Creature creature) {
        creature.setId(id);
        return creatureService.save(creature);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        creatureService.deleteById(id);
    }
}
