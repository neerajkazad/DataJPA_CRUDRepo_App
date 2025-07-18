package com.nk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    private Integer bookId;
    private String bookName;
    private Double bookPrice;

}
