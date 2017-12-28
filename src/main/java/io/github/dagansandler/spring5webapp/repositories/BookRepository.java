package io.github.dagansandler.spring5webapp.repositories;

import io.github.dagansandler.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
