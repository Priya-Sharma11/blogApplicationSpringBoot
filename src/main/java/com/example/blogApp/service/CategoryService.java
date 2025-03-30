package com.example.blogApp.service;

import com.example.blogApp.payloads.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    //create
    CategoryDto createCategory(CategoryDto categoryDto);

    //update
    CategoryDto updateCategory(CategoryDto categoryDto,Long categoryId);

    //delete
     void deleteCategory(Long categoryId);

    //get
    CategoryDto getCategory(Long categoryId);

    //getAll
    List<CategoryDto> getAllCategories();

}
