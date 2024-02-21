package com.todotravel.turismo.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TouristService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long serviceCode;
    protected String name;
    protected String briefDescription;
    protected String serviceDestiny;
    protected Date serviceDate;
    protected double serviceCost;
}
