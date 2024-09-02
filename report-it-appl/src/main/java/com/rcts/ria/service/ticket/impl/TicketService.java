package com.rcts.ria.service.ticket.impl;

import com.rcts.ria.domain.ticket.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    List<Ticket> getAllTicket();
    Optional<Ticket> getTicketById(Long id);
    List<Ticket> getTicketByEmployeeName(String name);
    List<Ticket> getTicketByStudentName(String name);

    Ticket addTicket(Ticket ticket);
}
