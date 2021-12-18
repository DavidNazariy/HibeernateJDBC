package app.repository.author.impl;

import app.dao.Author;
import app.dao.Book;
import app.repository.author.AuthorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {
    private final EntityManager entityManager;
    @Override
    public void save(Author author) {
        if(findByName(author.getAuthorName()).size()==0) {
            entityManager.getTransaction().begin();
            entityManager.persist(author);
            entityManager.getTransaction().commit();
            log.info("Saved author :",author);
        }
        else
            log.info("Author already exist:",author);
    }

    @Override
    public List findByName(String name) {
        return entityManager.createNativeQuery(" SELECT * FROM AUTHOR WHERE authorName = ?1", Author.class)
                .setParameter(1, name)
                .getResultList();
    }
}
