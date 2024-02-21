package com.todotravel.turismo.controller;

import com.todotravel.turismo.model.Client;
import com.todotravel.turismo.service.abstraction.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;
    @GetMapping("/{id}")
    public ResponseEntity<Client> getByid(@PathVariable Long id) {
        return new ResponseEntity<>(clientService.getById(id), HttpStatus.OK);
    }
    @GetMapping()
    public  ResponseEntity<List<Client>> getAll() {
        return new ResponseEntity<>(clientService.getAll(), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<Client> create(@RequestBody Client client) {
        return new ResponseEntity<>(clientService.create(client), HttpStatus.CREATED);
    }
}
