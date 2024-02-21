package com.todotravel.turismo.repository;


import com.todotravel.turismo.model.TouristPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristPackageRepository extends JpaRepository<TouristPackage, Long> {
}
