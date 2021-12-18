package app.repository.author;

import app.dao.Author;

import java.util.List;

public interface AuthorRepository {
    void save(Author author);
    List findByName(String name);
}
