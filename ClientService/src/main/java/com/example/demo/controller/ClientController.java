package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.proxy.ProductMicroserviceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ProductMicroserviceProxy productProxy;


    @GetMapping("/products")
    public List<ProductDTO> findAll() {

        List<ProductDTO> list = productProxy.findAll();
        return list;

    }


    @GetMapping("/findById/{id}")
    public ProductDTO findByd(@PathVariable int id) {

        ProductDTO prod = productProxy.findById(id);

        return prod;
    }
}