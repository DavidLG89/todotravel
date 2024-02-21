package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.Hotel;

import java.util.List;

public interface HotelService {

    Hotel getById(Long id);
    List<Hotel> getAll();
    Hotel create(Hotel hotel);
    Hotel update(Hotel hotel);
    void deleteById(Long id);
}
