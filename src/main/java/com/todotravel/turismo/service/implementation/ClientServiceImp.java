package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.Client;
import com.todotravel.turismo.repository.ClientRepository;
import com.todotravel.turismo.service.abstraction.ClientService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImp implements ClientService {
    private final ClientRepository clientRepository;
    @Override
    public Client getById(Long id) throws EntityNotFoundException {
        return clientRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}
