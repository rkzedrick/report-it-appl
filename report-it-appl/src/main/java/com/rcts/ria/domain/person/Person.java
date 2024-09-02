package com.rcts.ria.domain.person;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(length = 24)
    private String lastName;
    @Column(length = 64)
    private String firstName;
    @Column(length = 24)
    private String middleName;
    @Column(length = 64)
    private String address;
    private int contactNumber;
    private boolean userType;
    @Column(length = 32)
    private String email;
    private Date dateOfCreation;
}
