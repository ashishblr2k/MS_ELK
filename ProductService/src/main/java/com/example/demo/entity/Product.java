package com.example.demo.entity;

import lombok.Data;

@Data
public class Product {

    private int id;

    private String titre;

    private String description;

    private String image;

    private Double prix;
}
