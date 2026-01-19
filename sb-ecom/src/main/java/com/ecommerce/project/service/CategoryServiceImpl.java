// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.repositories.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CategoryServiceImpl implements CategoryService {
    private Long nextId = 1L;

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl() {
    }

    public List<Category> getAllCategories()
    {
        return this.categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category)
    {
        category.setCategoryId(nextId++);
        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not Found"));

        categoryRepository.delete(category);
        return "Category with categoryId: " + String.valueOf(categoryId) + " deleted successfully !!";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Category savedCategory = categoryRepository.findById(categoryId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not Found"));

        category.setCategoryId(categoryId);
        savedCategory=categoryRepository.save(category);
        return savedCategory;
    }
}
