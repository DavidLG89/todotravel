package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.TouristService;

import java.util.List;

public interface TouristServiceInt {
    TouristService getById(Long id);
    List<TouristService> getAll();
    TouristService create(TouristService touristService);
    TouristService update(TouristService touristService);
    void deleteById(Long id);
}
