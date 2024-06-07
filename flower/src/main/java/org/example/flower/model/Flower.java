package org.example.flower.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "flowers")
public class Flower {
    @Id
    private Long id;
    private String name;
    private String description;
    private List<String> imageList;
}
