package bjorn.springframework6.spring6webapp.services;

import bjorn.springframework6.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
