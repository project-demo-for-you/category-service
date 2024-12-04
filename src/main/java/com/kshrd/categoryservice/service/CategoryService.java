package com.kshrd.categoryservice.service;

import com.kshrd.categoryservice.model.Category;
import com.kshrd.categoryservice.model.request.CategoryRequest;

import java.util.List;

public interface CategoryService {
    Category createCategory(CategoryRequest categoryRequest);

    Category updateCategory(Long id, CategoryRequest categoryRequest);

    Category getCategory(Long id);

    void deleteCategory(Long id);

    List<Category> getAllCategories();
}
