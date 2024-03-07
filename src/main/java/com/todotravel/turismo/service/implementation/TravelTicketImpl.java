package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.TravelTicket;
import com.todotravel.turismo.repository.TravelTicketRepository;
import com.todotravel.turismo.service.abstraction.TravelTicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelTicketImpl implements TravelTicketService {

    @Autowired
    private TravelTicketRepository travelTicketRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public TravelTicket saveTravelTicket(TravelTicket travelTicket) {
        return null;
    }

    @Override
    public TravelTicket updateTravelTicket(TravelTicket travelTicket, Long id) {
        return null;
    }
}
