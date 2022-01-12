package garzeah.spring5webapp.bootstrap;

import garzeah.spring5webapp.model.Author;
import garzeah.spring5webapp.model.Book;
import garzeah.spring5webapp.model.Publisher;
import garzeah.spring5webapp.repositories.AuthorRepository;
import garzeah.spring5webapp.repositories.BookRepository;
import garzeah.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Tells Spring to detect this as a spring managed component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher namco = new Publisher("namco", "Earth", "Cupertino", "California", "94578");
        publisherRepository.save(namco);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123456");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(namco);
        namco.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(namco);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "654321");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(namco);
        namco.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(namco);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
        System.out.println("Publisher Number of books " + namco.getBooks().size());
    }
}
