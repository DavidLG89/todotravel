package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.TouristPackage;

import java.util.List;

public interface TouristPackageService {
    TouristPackage getById(Long id);
    List<TouristPackage> getAll();
    TouristPackage create(TouristPackage touristPackage);
    TouristPackage update(TouristPackage touristPackage);
    void deleteById(Long id);
}
