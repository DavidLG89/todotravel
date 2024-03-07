package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.exception.IdNotFoundException;
import com.todotravel.turismo.model.EventTicket;
import com.todotravel.turismo.repository.EventTicketRepository;
import com.todotravel.turismo.service.abstraction.EventTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventTicketImpl implements EventTicketService {

    @Autowired
    private EventTicketRepository eventTicketRepository;


    @Override
    public EventTicket saveEventTicket(EventTicket eventTicket) {
        return eventTicketRepository.save(eventTicket);
    }

    @Override
    public EventTicket updateEventTicket(EventTicket eventTicket, Long id) {
        var eventDb = eventTicketRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("La entrada del evento con id: " + id + " no se encuentra registrada." ));
        var idEvent = eventDb.getServiceCode();
        eventDb = eventTicket;
        eventDb.setServiceCode(idEvent);
        return eventTicketRepository.save(eventDb);
    }
}
