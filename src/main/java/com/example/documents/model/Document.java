package com.example.documents.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String author;

}
