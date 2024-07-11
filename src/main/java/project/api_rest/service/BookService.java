package project.api_rest.service;

import project.api_rest.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> listAll();
    Optional<Book> findById(Long id);
    void addBook(Book book);
    void updateBook(Long id, Book book);
    void deleteBook(Long id);

}
