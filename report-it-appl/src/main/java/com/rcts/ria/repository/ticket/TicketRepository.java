package com.rcts.ria.repository.ticket;

import com.rcts.ria.domain.ticket.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, String> {
    List<Ticket> findByType(String type);
    Ticket findByDescription(String description);
}
