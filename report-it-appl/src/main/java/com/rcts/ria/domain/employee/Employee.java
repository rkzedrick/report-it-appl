package com.rcts.ria.domain.employee;

import com.rcts.ria.domain.person.Person;
import com.rcts.ria.domain.user.principal.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Employee extends Person implements Serializable {
    private String employeeNumber;
    @Column(length = 32)
    private String positionInRc;
    private Date dateEmployed;
    private String sssNo;
    private String tinNo;
    private String pagibigNo;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
