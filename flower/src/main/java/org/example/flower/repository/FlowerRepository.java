package org.example.flower.repository;

import org.example.flower.model.Flower;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends MongoRepository<Flower, Long> {
}
