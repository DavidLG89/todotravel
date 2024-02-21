package com.todotravel.turismo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TouristPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageCode;
    @OneToMany
    private List<TouristService> includedServices;
    private Double packageCost;
}
