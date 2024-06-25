package com.hutech.tests3.Controllers.API;

import com.hutech.tests3.Entities.Product;
import com.hutech.tests3.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class RestProduct {

    @Autowired
    private ProductService productService;

    @CrossOrigin
    @GetMapping("")
    public List<Product> list() {
        return productService.getProducts();
    }
}
