package org.example.world.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "creatures")
public class Creature {
    @Id
    private Long id;
    private String name;
    private String description;
    private List<String> imageList;
}
