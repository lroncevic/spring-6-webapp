package com.lukaroncevic.spring6webapp.services;

import com.lukaroncevic.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
