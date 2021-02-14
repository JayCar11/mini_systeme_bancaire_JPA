package com.example.mini_system_bancaire_2.services.impl;

import com.example.mini_system_bancaire_2.entities.Adresse;
import com.example.mini_system_bancaire_2.entities.Client;
import com.example.mini_system_bancaire_2.repositories.ClientRepository;
import com.example.mini_system_bancaire_2.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {this.clientRepository = clientRepository;}

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> readOne(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> readAll() {
        return clientRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

}
