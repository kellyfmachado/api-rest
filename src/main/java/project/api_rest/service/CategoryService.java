package project.api_rest.service;

import project.api_rest.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> listAll();
    Optional<Category> findById(Long id);
    void addCategory(Category category);
    void updateCategory(Long id, Category category);
    void deleteCategory(Long id);

}
