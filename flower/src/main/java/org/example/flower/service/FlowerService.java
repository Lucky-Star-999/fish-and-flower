package org.example.flower.service;

import org.example.flower.model.Flower;
import org.example.flower.repository.FlowerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> findAll() {
        return flowerRepository.findAll();
    }

    public Flower findById(Long id) {
        return flowerRepository.findById(id).orElse(null);
    }

    public Flower save(Flower flower) {
        return flowerRepository.save(flower);
    }

    public void deleteById(Long id) {
        flowerRepository.deleteById(id);
    }
}
