package org.example.fish.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "fishes")
public class Fish {
    @Id
    private Long id;
    private String name;
    private String description;
    private List<String> imageList;
}
