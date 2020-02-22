package io.github.dagansandler.spring5webapp.bootstrap;

import io.github.dagansandler.spring5webapp.model.Author;
import io.github.dagansandler.spring5webapp.model.Book;
import io.github.dagansandler.spring5webapp.model.Publisher;
import io.github.dagansandler.spring5webapp.repositories.AuthorRepository;
import io.github.dagansandler.spring5webapp.repositories.BookRepository;
import io.github.dagansandler.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements CommandLineRunner {

    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) {
        initData();
    }

    private void initData() {
        Author eric = new Author("Eric", "Evans");
        Publisher hc = new Publisher("Harper Collins", "123 Sesame Street");
        Book ddd = new Book("Domain Driven Design", "1234", hc);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        publisherRepository.save(hc);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Publisher wrox = new Publisher("Wrox", "45 Yellow Brick Road");
        Book noEJB = new Book("J2EE Development without EJB", "23444", wrox);
        noEJB.getAuthors().add(rod);
        rod.getBooks().add(noEJB);

        publisherRepository.save(wrox);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Books in Repository: " + bookRepository.count());
        System.out.println("Authors in Reposistory: " + authorRepository.count());
    }

}
