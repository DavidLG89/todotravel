package com.todotravel.turismo.controller;

import com.todotravel.turismo.model.TouristService;
import com.todotravel.turismo.service.abstraction.TouristServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class TouristServiceController {

    @Autowired
    private TouristServiceInt touristService;


    @PostMapping
    private ResponseEntity<TouristService> createTouristService(@RequestBody TouristService service){
        return new ResponseEntity<>(touristService.create(service), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TouristService> getTouristService(@PathVariable Long id){
        return new ResponseEntity<>(touristService.getById(id), HttpStatus.OK);
    }

}
