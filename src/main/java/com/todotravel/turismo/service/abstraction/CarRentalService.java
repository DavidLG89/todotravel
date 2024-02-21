package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.CarRental;

import java.util.List;

public interface CarRentalService {
    CarRental getById(Long id);
    List<CarRental> getAll();
    CarRental create(CarRental carRental);
    CarRental update(CarRental carRental);
    void deleteById(Long id);
}
