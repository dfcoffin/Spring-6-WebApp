package guru.springframework.Spring6WebApp.services;

import guru.springframework.Spring6WebApp.domain.Book;

import java.util.Iterator;

/**
 * @author Donald F. Coffin
 */
public interface BookService {

	Iterator<Book> findAll();
}
