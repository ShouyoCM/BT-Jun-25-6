package com.hutech.tests3.Controllers.API;

import com.hutech.tests3.Entities.Category;
import com.hutech.tests3.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class RestCategory {

    @Autowired
    private CategoryService categoryService;

    @CrossOrigin
    @GetMapping("")
    public List<Category> list() {
        return categoryService.getAll();
    }
}
