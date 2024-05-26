package bjorn.springframework6.spring6webapp.repositories;

import bjorn.springframework6.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
