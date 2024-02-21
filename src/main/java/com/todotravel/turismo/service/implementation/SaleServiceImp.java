package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.Sale;
import com.todotravel.turismo.repository.SaleRepository;
import com.todotravel.turismo.service.abstraction.SaleService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleServiceImp implements SaleService {
    private final SaleRepository saleRepository;
    @Override
    public Sale getById(Long id) throws EntityNotFoundException {
        return saleRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
    }

    @Override
    public List<Sale> getAll() {
        return saleRepository.findAll();
    }

    @Override
    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public Sale update(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public void deleteById(Long id) {
        saleRepository.deleteById(id);
    }
}
