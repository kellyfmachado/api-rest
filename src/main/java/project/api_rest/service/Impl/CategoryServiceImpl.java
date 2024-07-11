package project.api_rest.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.api_rest.model.Category;
import project.api_rest.repository.CategoryRepository;
import project.api_rest.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> listAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }

    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    public void updateCategory(Long id, Category category){
        Optional<Category> categoryBd = categoryRepository.findById(id);
        if (categoryBd.isPresent()){
            categoryRepository.save(category);
        }
    }

    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }

}
