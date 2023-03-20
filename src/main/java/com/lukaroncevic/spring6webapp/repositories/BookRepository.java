package com.lukaroncevic.spring6webapp.repositories;

import com.lukaroncevic.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
