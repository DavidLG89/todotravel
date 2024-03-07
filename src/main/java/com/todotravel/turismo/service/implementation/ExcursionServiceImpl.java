package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.Excursion;
import com.todotravel.turismo.repository.ExcursionRepository;
import com.todotravel.turismo.service.abstraction.ExcursionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcursionServiceImpl implements ExcursionService {

    @Autowired
    private ExcursionRepository excursionRepository;


    @Override
    public Excursion saveExcursion(Excursion excursion) {
        return excursionRepository.save(excursion);
    }

    @Override
    public Excursion updateExcursion(Excursion excursion, Long id) {
        return null;
    }
}
