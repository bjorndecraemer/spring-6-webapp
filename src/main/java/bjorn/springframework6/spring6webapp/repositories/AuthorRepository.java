package bjorn.springframework6.spring6webapp.repositories;

import bjorn.springframework6.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>  {
}
