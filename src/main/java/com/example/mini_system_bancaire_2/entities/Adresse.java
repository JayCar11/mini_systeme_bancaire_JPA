package com.example.mini_system_bancaire_2.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "numéroCivique")
    private int numeroCivique;
    @Column(name = "rue")
    private String rue;
    @Column(name = "ville")
    private String ville;
    @Column(name = "codePostal")
    private String codePostal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCivique() {
        return numeroCivique;
    }

    public void setNumeroCivique(int numeroCivique) {
        this.numeroCivique = numeroCivique;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "numeroùCivique=" + numeroCivique +
                ", rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }
}
