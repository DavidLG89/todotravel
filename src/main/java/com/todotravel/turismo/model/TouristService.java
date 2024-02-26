package com.todotravel.turismo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class TouristService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long serviceCode;
    protected String name;
    protected String briefDescription;
    protected String serviceDestiny;
    protected Date serviceDate;
    protected double serviceCost;
}
