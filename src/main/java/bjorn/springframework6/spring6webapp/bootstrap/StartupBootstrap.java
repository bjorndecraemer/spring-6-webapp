package bjorn.springframework6.spring6webapp.bootstrap;

import bjorn.springframework6.spring6webapp.domain.Author;
import bjorn.springframework6.spring6webapp.domain.Book;
import bjorn.springframework6.spring6webapp.domain.Publisher;
import bjorn.springframework6.spring6webapp.repositories.AuthorRepository;
import bjorn.springframework6.spring6webapp.repositories.BookRepository;
import bjorn.springframework6.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StartupBootstrap implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public StartupBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("StartupBootstrap");
        Publisher addisonWesley = new Publisher();
        addisonWesley.setPublisherName("Addison-Wesley");
        addisonWesley.setCity("Maine");
        Publisher savedAddisonWesley = publisherRepository.save(addisonWesley);

        Author ericEvans = new Author("Eric", "Evans");
        Author savedEric = authorRepository.save(ericEvans);
        Book ddd = new Book("DDD", "Evans","12345");

        Book dddSaved = bookRepository.save(ddd);
        dddSaved.getAuthors().add(savedEric);
        ddd.setPublisher(savedAddisonWesley);
        //authorRepository.save(savedEric);
        bookRepository.save(ddd);
        publisherRepository.save(savedAddisonWesley);
        System.out.println(authorRepository.findById(savedEric.getId()));
        System.out.println(bookRepository.findById(dddSaved.getId()));
        System.out.println(publisherRepository.findById(savedAddisonWesley.getId()));
        System.out.println(bookRepository.findByPublisher(savedAddisonWesley));

    }
}
