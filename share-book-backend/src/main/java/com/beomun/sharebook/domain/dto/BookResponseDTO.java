package com.beomun.sharebook.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BookResponseDTO {

    private Long bookId;
    private String bookTitle;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
