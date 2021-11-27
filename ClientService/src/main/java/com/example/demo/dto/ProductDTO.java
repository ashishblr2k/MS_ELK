package com.example.demo.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private int id;

    private String titre;

    private String description;

    private String image;

    private Double prix;
}
