package bjorn.springframework6.spring6webapp.repositories;

import bjorn.springframework6.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
