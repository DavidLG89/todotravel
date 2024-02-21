package com.todotravel.turismo.repository;


import com.todotravel.turismo.model.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRentalRepository extends JpaRepository<CarRental, Long> {
}
