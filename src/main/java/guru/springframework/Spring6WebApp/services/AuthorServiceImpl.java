package guru.springframework.Spring6WebApp.services;

import guru.springframework.Spring6WebApp.domain.Author;
import guru.springframework.Spring6WebApp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

/**
 * @author Donald F. Coffin
 */
@Service
public class AuthorServiceImpl implements AuthorService {

	private final AuthorRepository authorRepository;

	public AuthorServiceImpl(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	@Override
	public Iterable<Author> findAll() {
		return authorRepository.findAll();
	}
}
