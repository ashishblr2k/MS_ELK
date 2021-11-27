package com.example.demo.proxy;

import com.example.demo.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name = "product-service", url = "localhost:8082")
@FeignClient(name = "zuul-service")
public interface ProductMicroserviceProxy{

    @GetMapping(value = "/product-service/products")
    List<ProductDTO> findAll();

    @GetMapping( value = "/product-service/products/{id}")
    ProductDTO findById(@PathVariable("id") int id);

    /*@GetMapping(value = "/product-service/products")
    List<ProductDTO> findAll();

    @GetMapping( value = "/product-service/products/{id}")
    ProductDTO findById(@PathVariable("id") int id);*/


}

