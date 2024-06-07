package org.example.fish.service;

import org.example.fish.model.Fish;
import org.example.fish.repository.FishRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {

    private final FishRepository fishRepository;

    public FishService(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

    public List<Fish> findAll() {
        return fishRepository.findAll();
    }

    public Fish findById(Long id) {
        return fishRepository.findById(id).orElse(null);
    }

    public Fish save(Fish fish) {
        return fishRepository.save(fish);
    }

    public void deleteById(Long id) {
        fishRepository.deleteById(id);
    }
}
