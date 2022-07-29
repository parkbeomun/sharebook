package com.beomun.sharebook.sample.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class People {

    @Id
    private Long id;
    private String first;
    private String last;

}
