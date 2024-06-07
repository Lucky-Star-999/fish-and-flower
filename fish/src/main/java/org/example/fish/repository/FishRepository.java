package org.example.fish.repository;

import org.example.fish.model.Fish;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishRepository extends MongoRepository<Fish, Long> {
}
