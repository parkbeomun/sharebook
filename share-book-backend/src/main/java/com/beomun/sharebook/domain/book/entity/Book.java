package com.beomun.sharebook.domain.book.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Book {

    @Id
    private Long bookId;
    private String bookTitle;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
