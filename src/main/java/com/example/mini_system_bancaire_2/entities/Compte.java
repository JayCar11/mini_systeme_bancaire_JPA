package com.example.mini_system_bancaire_2.entities;

import javax.persistence.*;

@Entity
@Table(name = "compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int compte_id;

    @Column(name = "type")
    private String type;

    @Column(name = "solde")
    private double solde;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Gestionnaire gestionnaire;



    public int getCompte_id() {
        return compte_id;
    }

    public void setCompte_id(int compte_id) {
        this.compte_id = compte_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Gestionnaire getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "compte_id=" + compte_id +
                ", type='" + type + '\'' +
                '}';
    }
}
