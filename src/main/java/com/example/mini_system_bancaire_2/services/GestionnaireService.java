package com.example.mini_system_bancaire_2.services;

import com.example.mini_system_bancaire_2.entities.Client;
import com.example.mini_system_bancaire_2.entities.Gestionnaire;

import java.util.List;
import java.util.Optional;

public interface GestionnaireService {

    Gestionnaire create(Gestionnaire gestionnaire);

    Optional<Gestionnaire> readOne(Long id);

    List<Gestionnaire> readAll();

    void delete(Long id);
}
