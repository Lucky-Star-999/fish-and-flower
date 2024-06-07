package org.example.world.repository;

import org.example.world.model.Creature;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatureRepository extends MongoRepository<Creature, Long> {
}
