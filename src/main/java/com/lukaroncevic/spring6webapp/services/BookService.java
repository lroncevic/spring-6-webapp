package com.lukaroncevic.spring6webapp.services;

import com.lukaroncevic.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
