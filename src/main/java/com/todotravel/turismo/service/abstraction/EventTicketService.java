package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.EventTicket;

public interface EventTicketService {

    EventTicket saveEventTicket(EventTicket eventTicket);
    EventTicket updateEventTicket(EventTicket eventTicket, Long id);
}
