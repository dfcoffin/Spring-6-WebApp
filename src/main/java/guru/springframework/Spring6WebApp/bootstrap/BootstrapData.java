package guru.springframework.Spring6WebApp.bootstrap;

import guru.springframework.Spring6WebApp.domain.Author;
import guru.springframework.Spring6WebApp.domain.Book;
import guru.springframework.Spring6WebApp.domain.Publisher;
import guru.springframework.Spring6WebApp.repositories.AuthorRepository;
import guru.springframework.Spring6WebApp.repositories.BookRepository;
import guru.springframework.Spring6WebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Donald F. Coffin
 */
@Component
public class BootstrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
						 PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Author eric = new Author();
		eric.setFirstName("Eric");
		eric.setLastName("Evans");

		Book ddd = new Book();
		ddd.setTitle("Domain Driven Design");
		ddd.setIsbn("978-0321125217");

		Author ericSaved = authorRepository.save(eric);
		Book dddSaved = bookRepository.save(ddd);

		Author rod = new Author();
		rod.setFirstName("Rod");
		rod.setLastName("Johnson");

		Book noEJB = new Book();
		noEJB.setTitle("J2EE Development without EJB");
		noEJB.setIsbn("978-0764558313");

		Author rodSaved = authorRepository.save(rod);
		Book noEJBSaved = bookRepository.save(noEJB);

		ericSaved.getBooks().add(dddSaved);
		rodSaved.getBooks().add(noEJBSaved);

		authorRepository.save(ericSaved);
		authorRepository.save(rodSaved);

		System.out.println("In Bootstrap");
		System.out.println("Author Count: " + authorRepository.count());
		System.out.println("Book Count: " + bookRepository.count());

		Publisher publisher = new Publisher();
		publisher.setPublisherName("Penguin Random House");
		publisher.setAddress("1745 Broadway");
		publisher.setCity("New York");
		publisher.setState("New York");
		publisher.setZipCode("10019");
		publisherRepository.save(publisher);

		System.out.println("Publisher Count: " + publisherRepository.count());
	}
}
