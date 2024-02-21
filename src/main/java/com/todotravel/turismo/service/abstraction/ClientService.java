package com.todotravel.turismo.service.abstraction;


import com.todotravel.turismo.model.Client;

import java.util.List;

public interface ClientService {
    Client getById(Long id);
    List<Client> getAll();
    Client create(Client client);
    Client update(Client client);
    void deleteById(Long id);
}
