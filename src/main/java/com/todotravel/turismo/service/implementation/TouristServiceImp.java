package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.TouristService;
import com.todotravel.turismo.repository.TouristServiceRepository;
import com.todotravel.turismo.service.abstraction.TouristServiceInt;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TouristServiceImp implements TouristServiceInt {
    private final TouristServiceRepository touristServiceRepository;
    @Override
    public TouristService getById(Long id) throws EntityNotFoundException {
        return touristServiceRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
    }

    @Override
    public List<TouristService> getAll() {
        return touristServiceRepository.findAll();
    }

    @Override
    public TouristService create(TouristService touristService) {
        return touristServiceRepository.save(touristService);
    }

    @Override
    public TouristService update(TouristService touristService) {
        return touristServiceRepository.save(touristService);
    }

    @Override
    public void deleteById(Long id) {
        touristServiceRepository.deleteById(id);
    }
}
