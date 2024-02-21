package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.*;
import com.todotravel.turismo.repository.SaleRepository;
import com.todotravel.turismo.service.abstraction.SaleService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

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
    @Transactional
    public Sale create() {
        Sale sale = new Sale();
        sale.setSaleDate(LocalDate.now());
        sale.setSaleNumber(UUID.randomUUID().toString());
        sale.setClient(new Client(1L));
        sale.setEmployee(new Employee(1L));
        TouristService hotel = new Hotel(1L);
        sale.setTouristService(hotel);
        sale.setPaymentMethod("CASH");
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
