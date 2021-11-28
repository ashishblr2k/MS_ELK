package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.proxy.ProductMicroserviceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ProductMicroserviceProxy productProxy;

    Logger logger = LoggerFactory.getLogger(ClientController.class);

    @GetMapping("/products")
    public List<ProductDTO> findAll() {

        List<ProductDTO> list = productProxy.findAll();
        return list;

    }


    @GetMapping("/findById/{id}")
    public ProductDTO findByd(@PathVariable int id) {
        logger.info("findByd"+id);
        logger.info("findByd plus ten"+id+10);
        ProductDTO prod = productProxy.findById(id);

        return prod;
    }
}