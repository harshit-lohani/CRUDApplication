package com.project.CRUDApplication.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    @Id
    private Long id;

    private String title;

    private String author;

}
