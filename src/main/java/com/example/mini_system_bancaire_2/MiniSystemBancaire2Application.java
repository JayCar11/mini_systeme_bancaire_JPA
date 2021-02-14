package com.example.mini_system_bancaire_2;


import com.example.mini_system_bancaire_2.entities.Adresse;
import com.example.mini_system_bancaire_2.entities.Client;
import com.example.mini_system_bancaire_2.entities.Compte;
import com.example.mini_system_bancaire_2.entities.Gestionnaire;
import com.example.mini_system_bancaire_2.services.impl.ClientServiceImpl;
import com.example.mini_system_bancaire_2.services.impl.CompteServiceImpl;
import com.example.mini_system_bancaire_2.services.impl.GestionnaireServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Annotation des beans
import org.springframework.context.annotation.Bean;


//IoC par mutation
import org.springframework.beans.factory.annotation.Autowired;


// Pour importations des logs
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@SpringBootApplication
public class MiniSystemBancaire2Application {

    private final Logger log = LoggerFactory.getLogger(MiniSystemBancaire2Application.class);

    @Autowired
    private ClientServiceImpl clientService;

    @Autowired
    CompteServiceImpl compteService;

    @Autowired
    GestionnaireServiceImpl gestionnaireService;

    public static void main(String[] args) {
        SpringApplication.run(MiniSystemBancaire2Application.class, args);

    }

    @Bean
    public void crudClient(){
        Adresse adresseClient = new Adresse();
        adresseClient.setNumeroCivique(391);
        adresseClient.setRue("Rue du trap house");
        adresseClient.setVille("Laval");
        adresseClient.setCodePostal("jwu 8gy");

        Client client = new Client();
        client.setFname("Jeremy");
        client.setLname("Carriere");
        client.setAdresse(adresseClient);
        client.setNumTelephone("455-344-2344");
        client.setSalary(75000);
        client.setCode_conf(0000);
        client = clientService.create(client);

        log.info("****************** save client : {}", client.toString());

        List<Client> clients = clientService.readAll();
        log.info("****************** read all users : {}", clients);

    }

    @Bean
    public void crudGestionnaire(){
        Adresse adresseGest = new Adresse();
        adresseGest.setNumeroCivique(391);
        adresseGest.setRue("Rue du boat");
        adresseGest.setVille("st-jean");
        adresseGest.setCodePostal("U8P 7T6");

        Gestionnaire gestionnaire = new Gestionnaire();
        gestionnaire.setFname("Dave");
        gestionnaire.setLname("Ps");
        gestionnaire.setAdresse(adresseGest);
        gestionnaire.setNumTelephone("455-344-1212");
        gestionnaire.setId(1112);
        gestionnaire.setPassword("pass");

        gestionnaire = gestionnaireService.create(gestionnaire);

        log.info("****************** save gestionnaire : {}", gestionnaire.toString());

        List<Gestionnaire> gestionnaires = gestionnaireService.readAll();
        log.info("****************** read all users : {}", gestionnaires);
    }

}
