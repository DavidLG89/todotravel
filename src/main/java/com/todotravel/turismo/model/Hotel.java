package com.todotravel.turismo.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hotel extends TouristService {
    private String roomType;
    private int stars;

    public Hotel(Long id){
        this.serviceCode = id;
    }
}
