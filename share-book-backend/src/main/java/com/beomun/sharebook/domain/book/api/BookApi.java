package com.beomun.sharebook.domain.book.api;

import com.beomun.sharebook.domain.book.entity.Book;
import com.beomun.sharebook.domain.book.service.BookService;
import com.beomun.sharebook.domain.dto.BookRequestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookApi {

    private BookService bookService;

    public BookApi(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBookList() {
        return null;
    }

    @GetMapping
    public List<Book> getBookList(@PathVariable("id") Long id) {
        return null;
    }

    @PutMapping
    public Object saveBook(BookRequestDTO bookRequestDTO) {
        return null;
    }

    @PostMapping
    public Object updateBook(BookRequestDTO bookRequestDTO) {

        return null;
    }

    @DeleteMapping("/{id}}")
    public Object deleteBook(@PathVariable("id") Long id) {
        return null;
    }
}
