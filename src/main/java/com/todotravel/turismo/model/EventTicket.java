package com.todotravel.turismo.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="events_tickets")
public class EventTicket extends TouristService{

    private String event_type;
    private String artist;

}
