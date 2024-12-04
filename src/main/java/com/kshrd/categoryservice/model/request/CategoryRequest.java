package com.kshrd.categoryservice.model.request;

import com.kshrd.categoryservice.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {
    private String name;

    public Category toEntity() {
        return new Category(null, name);
    }

    public Category toEntity(Long id) {
        return new Category(id, name);
    }

}
