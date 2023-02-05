package guru.springframework.Spring6WebApp.services;

import guru.springframework.Spring6WebApp.domain.Book;
import guru.springframework.Spring6WebApp.repositories.BookRepository;
import org.springframework.stereotype.Service;

/**
 * @author Donald F. Coffin
 */
@Service
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}
}
