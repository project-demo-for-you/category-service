package com.kshrd.categoryservice.service.impl;

import com.kshrd.categoryservice.model.Category;
import com.kshrd.categoryservice.model.request.CategoryRequest;
import com.kshrd.categoryservice.repository.CategoryRepository;
import com.kshrd.categoryservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category createCategory(CategoryRequest categoryRequest) {
        return categoryRepository.save(categoryRequest.toEntity());
    }

    @Override
    public Category updateCategory(Long id, CategoryRequest categoryRequest) {
        return categoryRepository.save(categoryRequest.toEntity(id));
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
