package project.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.api_rest.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
