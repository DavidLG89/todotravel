package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.Sale;

import java.util.List;

public interface SaleService {
    Sale getById(Long id);
    List<Sale> getAll();
    Sale create(Sale sale);
    Sale create();
    Sale update(Sale sale);
    void deleteById(Long id);
}
