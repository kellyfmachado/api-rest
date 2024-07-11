package project.api_rest.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Date publicationDate;
    @ManyToOne
    private Author autor;
    @ManyToOne
    private Category category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
