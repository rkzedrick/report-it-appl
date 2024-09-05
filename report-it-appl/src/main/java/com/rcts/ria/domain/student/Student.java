package com.rcts.ria.domain.student;

import com.rcts.ria.domain.person.Person;
import com.rcts.ria.domain.user.principal.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Student extends Person implements Serializable {
    @Column(length = 10)
    private String studentNumber;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
