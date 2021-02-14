package com.example.mini_system_bancaire_2.services.impl;

import com.example.mini_system_bancaire_2.entities.Client;
import com.example.mini_system_bancaire_2.services.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompteServiceImpl implements ClientService {
    @Override
    public Client create(Client user) {
        return null;
    }

    @Override
    public Optional<Client> readOne(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Client> readAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
