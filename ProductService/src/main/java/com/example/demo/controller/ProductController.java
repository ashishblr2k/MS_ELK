package com.example.demo.controller;

import com.example.demo.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping(value = "/products")
    public List<Product> findAll() {


        return new ArrayList<Product>() ;

    }


    @GetMapping( value = "/products/{id}")
    public Product findByd(@PathVariable int id) {
        logger.info("findByd"+id);
        logger.info("findByd plus ten"+id+10);
        return new Product(id,"hello","","",null);
    }
}
