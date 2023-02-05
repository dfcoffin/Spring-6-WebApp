package guru.springframework.Spring6WebApp.services;

import guru.springframework.Spring6WebApp.domain.Book;

/**
 * @author Donald F. Coffin
 */
public interface BookService {

	Iterable<Book> findAll();
}
