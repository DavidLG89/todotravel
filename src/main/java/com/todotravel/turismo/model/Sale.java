package com.todotravel.turismo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String saleNumber;
    private LocalDate saleDate;
    private String paymentMethod;
    @ManyToOne
    private Client client;
    @ManyToOne
    private TouristPackage touristPackage;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private TouristService touristService;
}
