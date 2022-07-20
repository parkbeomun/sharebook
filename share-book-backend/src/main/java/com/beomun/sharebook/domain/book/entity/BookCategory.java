package com.beomun.sharebook.domain.book.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class BookCategory {

    @Id
    private int bookCategoryId;
    private String bookCategoryName;
    private String bookCategoryOrder;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
