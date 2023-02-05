package guru.springframework.Spring6WebApp.repositories;

import guru.springframework.Spring6WebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Donald F. Coffin
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
