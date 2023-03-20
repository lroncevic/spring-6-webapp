package com.lukaroncevic.spring6webapp.repositories;

import com.lukaroncevic.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
