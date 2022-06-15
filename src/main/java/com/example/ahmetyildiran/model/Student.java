package com.example.ahmetyildiran.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;


@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull(message = "fill in the blank")
    @Size(min = 3)
    private String nameSurname;

    @NotNull(message = "fill in the blank")
    private String schoolName;

    @Email(message = "fill in the blank")
    private String email;

    @NotNull(message = "fill in the blank")
    @Min(value = 18, message = "greater than 18")
    private int age;

    @NotNull(message = "fill in the blank")
    private String phone;


}
