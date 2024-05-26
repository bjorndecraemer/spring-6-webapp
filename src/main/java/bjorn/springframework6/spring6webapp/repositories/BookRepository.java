package bjorn.springframework6.spring6webapp.repositories;

import bjorn.springframework6.spring6webapp.domain.Book;
import bjorn.springframework6.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface BookRepository extends CrudRepository<Book, Long> {
    Set<Book> findByPublisher(Publisher savedAddisonWesley);
}
