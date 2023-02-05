package guru.springframework.Spring6WebApp.services;

import guru.springframework.Spring6WebApp.domain.Author;

/**
 * @author Donald F. Coffin
 */
public interface AuthorService {
	Iterable<Author> findAll();
}
