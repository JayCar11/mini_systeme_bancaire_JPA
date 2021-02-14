package com.example.mini_system_bancaire_2.services.impl;

import com.example.mini_system_bancaire_2.entities.Gestionnaire;
import com.example.mini_system_bancaire_2.repositories.GestionnaireRepository;
import com.example.mini_system_bancaire_2.services.GestionnaireService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GestionnaireServiceImpl implements GestionnaireService {

    private final GestionnaireRepository gestionnaireRepository;

    public GestionnaireServiceImpl(GestionnaireRepository gestionnaireRepository) {
        this.gestionnaireRepository = gestionnaireRepository;
    }

    @Override
    public Gestionnaire create(Gestionnaire gestionnaire) {
        return gestionnaireRepository.save(gestionnaire);
    }

    @Override
    public Optional<Gestionnaire> readOne(Long id) {
        return gestionnaireRepository.findById(id);
    }

    @Override
    public List<Gestionnaire> readAll() {
        return gestionnaireRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        gestionnaireRepository.deleteById(id);
    }
}
