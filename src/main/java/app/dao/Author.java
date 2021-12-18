package app.dao;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Table (name = "author")
@Builder
public class Author {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String authorName;

    public Author(Long id, String authorName) {
        this.id = id;
        this.authorName = authorName;
    }

    public Author() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}