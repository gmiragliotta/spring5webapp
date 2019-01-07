package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 5/17/17.
 */
@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
