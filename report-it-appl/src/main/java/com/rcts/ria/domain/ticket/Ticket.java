package com.rcts.ria.domain.ticket;

import com.rcts.ria.domain.person.Person;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Ticket implements Serializable {
    @Id
    private Long id;
    private String person;
    @Column(length = 64)
    private String description;
    private Date createdDate;
    private Date finishedDate;
}
