package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.Hotel;
import com.todotravel.turismo.repository.HotelRepository;
import com.todotravel.turismo.service.abstraction.HotelService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImp implements HotelService {
    private final HotelRepository hotelRepository;
    @Override
    public Hotel getById(Long id) throws EntityNotFoundException {
        return hotelRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel create(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteById(Long id) {
        hotelRepository.deleteById(id);
    }
}
