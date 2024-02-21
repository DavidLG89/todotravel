package com.todotravel.turismo.repository;

import com.todotravel.turismo.model.TouristService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristServiceRepository extends JpaRepository<TouristService, Long> {
}
