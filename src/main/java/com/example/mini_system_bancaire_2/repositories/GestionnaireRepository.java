package com.example.mini_system_bancaire_2.repositories;

import com.example.mini_system_bancaire_2.entities.Client;
import com.example.mini_system_bancaire_2.entities.Gestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Long> {
}
