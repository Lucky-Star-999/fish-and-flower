package org.example.world.service;

import org.example.world.model.Creature;
import org.example.world.repository.CreatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatureService {

    private final CreatureRepository creatureRepository;

    public CreatureService(CreatureRepository creatureRepository) {
        this.creatureRepository = creatureRepository;
    }

    public List<Creature> findAll() {
        return creatureRepository.findAll();
    }

    public Creature findById(Long id) {
        return creatureRepository.findById(id).orElse(null);
    }

    public Creature save(Creature creature) {
        return creatureRepository.save(creature);
    }

    public void deleteById(Long id) {
        creatureRepository.deleteById(id);
    }
}
