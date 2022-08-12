package com.beomun.sharebook.domain.book.api;

import com.beomun.sharebook.domain.book.entity.Book;
import com.beomun.sharebook.domain.book.service.BookService;
import com.beomun.sharebook.domain.dto.BookRequestDTO;
import org.springframework.http.ResponseEntity;
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
        return bookService.getBookList();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Object saveBook(BookRequestDTO bookRequestDTO) {
        return bookService.saveBook(bookRequestDTO);
    }

    @PutMapping("/{id}")
    public Object updateBook(@PathVariable("id") Long id, @RequestBody BookRequestDTO bookRequestDTO) {
        return bookService.updateBook(id, bookRequestDTO);
    }

    @DeleteMapping("/{id}}")
    public ResponseEntity<?> deleteBook(@PathVariable("id") Long id) {
        return ResponseEntity.ok().build();
    }
}
