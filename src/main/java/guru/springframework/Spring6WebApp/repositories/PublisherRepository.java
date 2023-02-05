package guru.springframework.Spring6WebApp.repositories;

import guru.springframework.Spring6WebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Donald F. Coffin
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
