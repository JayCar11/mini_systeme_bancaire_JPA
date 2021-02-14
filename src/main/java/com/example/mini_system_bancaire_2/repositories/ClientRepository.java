package com.example.mini_system_bancaire_2.repositories;

import com.example.mini_system_bancaire_2.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
