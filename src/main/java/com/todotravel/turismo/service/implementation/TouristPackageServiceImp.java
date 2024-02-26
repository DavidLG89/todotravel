package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.TouristPackage;
import com.todotravel.turismo.repository.TouristPackageRepository;
import com.todotravel.turismo.service.abstraction.TouristPackageService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TouristPackageServiceImp implements TouristPackageService {

    private final TouristPackageRepository touristPackageRepository;

    @Override
    public TouristPackage getById(Long id) throws EntityNotFoundException {
        return touristPackageRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
    }

    @Override
    public List<TouristPackage> getAll() {
        return touristPackageRepository.findAll();
    }

    @Override
    public TouristPackage create(TouristPackage touristPackage) {
        return touristPackageRepository.save(touristPackage);
    }

    @Override
    public TouristPackage update(TouristPackage touristPackage) {
        return touristPackageRepository.save(touristPackage);
    }

    @Override
    public void deleteById(Long id) {
        touristPackageRepository.deleteById(id);
    }
}
