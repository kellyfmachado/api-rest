package project.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.api_rest.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
