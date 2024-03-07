package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.TravelTicket;

public interface TravelTicketService {

    TravelTicket saveTravelTicket(TravelTicket travelTicket);
    TravelTicket updateTravelTicket(TravelTicket travelTicket, Long id);
}
