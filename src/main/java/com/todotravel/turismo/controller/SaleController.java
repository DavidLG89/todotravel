package com.todotravel.turismo.controller;

import com.todotravel.turismo.model.Sale;
import com.todotravel.turismo.service.abstraction.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tt-api/v1/sale")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;
    @PostMapping
    public Sale sale(){
        return saleService.create();
    }
}
