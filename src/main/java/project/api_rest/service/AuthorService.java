package project.api_rest.service;

import project.api_rest.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

     List<Author> listAll();
     Optional<Author> findById(Long id);
     void addAuthor(Author author);
     void updateAuthor(Long id, Author author);
     void deleteAuthor(Long id);

}
