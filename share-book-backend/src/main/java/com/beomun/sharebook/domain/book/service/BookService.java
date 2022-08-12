package com.beomun.sharebook.domain.book.service;

import com.beomun.sharebook.domain.book.entity.Book;
import com.beomun.sharebook.domain.book.repository.BookRepository;
import com.beomun.sharebook.domain.dto.BookRequestDTO;
import com.beomun.sharebook.global.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBookList() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));
    }

    public Book saveBook(BookRequestDTO bookRequestDTO) {
        Book book = Book.builder()
                .bookTitle(bookRequestDTO.getBookTitle())
                .build();
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, BookRequestDTO bookRequestDTO) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));

        book.setBookTitle(bookRequestDTO.getBookTitle());

        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book", "id", id));
        bookRepository.delete(book);
    }



}
