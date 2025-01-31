package project.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.api_rest.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
