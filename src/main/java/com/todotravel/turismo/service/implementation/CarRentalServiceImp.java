package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.CarRental;
import com.todotravel.turismo.repository.CarRentalRepository;
import com.todotravel.turismo.service.abstraction.CarRentalService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarRentalServiceImp implements CarRentalService {
    private final CarRentalRepository carRentalRepository;
    @Override
    public CarRental getById(Long id) throws EntityNotFoundException {
        return carRentalRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de alquiler de auto con id: " + id + " no existe en base de datos"));
    }

    @Override
    public List<CarRental> getAll() {
        return carRentalRepository.findAll();
    }

    @Override
    public CarRental create(CarRental carRental) {
        return carRentalRepository.save(carRental);
    }

    @Override
    public CarRental update(CarRental carRental) {
        return carRentalRepository.save(carRental);
    }

    @Override
    public void deleteById(Long id) {
        carRentalRepository.deleteById(id);
    }
}
