package project.api_rest.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.api_rest.model.Book;
import project.api_rest.repository.BookRepository;
import project.api_rest.service.BookService;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> listAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void updateBook(Long id, Book book){
        Optional<Book> bookBd = bookRepository.findById(id);
        if (bookBd.isPresent()){
            bookRepository.save(book);
        }
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

}
