package project.api_rest.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.api_rest.model.Author;
import project.api_rest.repository.AuthorRepository;
import project.api_rest.service.AuthorService;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> listAll(){
        return authorRepository.findAll();
    }

    public Optional<Author> findById(Long id){
        return authorRepository.findById(id);
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public void updateAuthor(Long id, Author author){
        Optional<Author> authorBd = authorRepository.findById(id);
        if (authorBd.isPresent()){
            authorRepository.save(author);
        }
    }

    public void deleteAuthor(Long id){
        authorRepository.deleteById(id);
    }

}
