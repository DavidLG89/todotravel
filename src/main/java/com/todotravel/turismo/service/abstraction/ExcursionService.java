package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.Excursion;

public interface ExcursionService {

    Excursion saveExcursion(Excursion excursion);
    Excursion updateExcursion(Excursion excursion, Long id);
}
