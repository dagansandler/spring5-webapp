package io.github.dagansandler.spring5webapp.repositories;

import io.github.dagansandler.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
