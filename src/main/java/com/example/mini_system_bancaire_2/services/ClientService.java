package com.example.mini_system_bancaire_2.services;

import com.example.mini_system_bancaire_2.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClientService {

    Client create(Client user);

    Optional<Client> readOne(Long id);

    List<Client> readAll();

    void delete(Long id);

}
