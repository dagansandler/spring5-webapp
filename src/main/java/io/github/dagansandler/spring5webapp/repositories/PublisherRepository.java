package io.github.dagansandler.spring5webapp.repositories;

import io.github.dagansandler.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
