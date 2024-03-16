package com.todotravel.turismo.controller;

import com.todotravel.turismo.model.dto.request.HotelDTOReq;
import com.todotravel.turismo.model.dto.response.HotelDTORes;
import com.todotravel.turismo.service.abstraction.HotelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;


    @PostMapping()
    public ResponseEntity<HotelDTORes> create(@Valid @RequestBody HotelDTOReq hotel){
        return new ResponseEntity<>(hotelService.create(hotel), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelDTORes> getById(@PathVariable Long id){
        return new ResponseEntity<>(hotelService.getById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Page<HotelDTORes>> getAll(Pageable pageable) {
        return new ResponseEntity<>(hotelService.getAll(pageable), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<HotelDTORes> update(@Valid @RequestBody HotelDTOReq hotelDTOReq) {
        return new ResponseEntity<>(hotelService.update(hotelDTOReq), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable Long id) {
        hotelService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
