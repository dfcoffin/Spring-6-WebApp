package guru.springframework.Spring6WebApp.repositories;

import guru.springframework.Spring6WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Donald F. Coffin
 */
public interface AuthorRepository extends CrudRepository <Author, Long> {
}
