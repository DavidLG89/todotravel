package com.todotravel.turismo.controller;

import com.todotravel.turismo.model.TouristPackage;
import com.todotravel.turismo.service.abstraction.TouristPackageService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/packages")
public class TouristPackageController {

    @Autowired
    private TouristPackageService touristPackageService;

    @PostMapping()
    public ResponseEntity<TouristPackage> createTouristPackage(@RequestBody TouristPackage touristPackage){
        return new ResponseEntity<>(touristPackageService.create(touristPackage), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TouristPackage> getTouristPackage(@PathVariable Long id){
        return new ResponseEntity<>(touristPackageService.getById(id), HttpStatus.OK);
    }


}
