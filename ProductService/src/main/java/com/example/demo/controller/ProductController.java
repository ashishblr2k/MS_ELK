package com.example.demo.controller;

import com.example.demo.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping(value = "/products")
    public List<Product> findAll() {


        return new ArrayList<Product>() ;

    }


    @GetMapping( value = "/products/{id}")
    public Product findByd(@PathVariable int id) {

        return null;
    }
}
