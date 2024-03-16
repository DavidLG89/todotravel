package com.todotravel.turismo.controller;

import com.todotravel.turismo.model.dto.request.TouristPackageDTOReq;
import com.todotravel.turismo.model.dto.response.TouristPackageDTORes;
import com.todotravel.turismo.service.abstraction.TouristPackageService;
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
    public ResponseEntity<TouristPackageDTORes> createTouristPackage(@RequestBody TouristPackageDTOReq touristPackageDTOReq){
        return new ResponseEntity<>(touristPackageService.create(touristPackageDTOReq), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TouristPackageDTORes> getTouristPackage(@PathVariable Long id){
        return new ResponseEntity<>(touristPackageService.getById(id), HttpStatus.OK);
    }


}
