package com.beomun.sharebook.domain.book.service;

import com.beomun.sharebook.domain.book.entity.Book;
import com.beomun.sharebook.domain.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBookList() {
        return null;
    }

    public Book getBookById(String id) {
        return null;
    }

    public void saveBook(Book book) {

    }

    public void updateBook(Book book) {

    }

    public void deleteBook(String id) {

    }



}
