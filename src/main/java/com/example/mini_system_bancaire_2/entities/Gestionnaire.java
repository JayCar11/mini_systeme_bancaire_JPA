package com.example.mini_system_bancaire_2.entities;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "gestionnaire")
public class Gestionnaire {
    @Column(name = "firstName")
    private String fname;
    @Column(name = "lastName")
    private String lname;
    @OneToOne(cascade = CascadeType.ALL)
    private Adresse adresse;
    @Column(name = "numTelephone")
    private String numTelephone;
    @Column(name = "email")
    private String email;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "suc_id")
    private int sucursale_id;
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "password")
    private String password;
    private int failed_attemps;



    public int getSucursale_id() {
        return sucursale_id;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getFailed_attemps() {
        return failed_attemps;
    }

    public void setFailed_attemps(int failed_attemps) {
        this.failed_attemps = failed_attemps;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setSucursale_id(int sucursale_id) {
        this.sucursale_id = sucursale_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Gestionnaire{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", adresse=" + adresse +
                ", numTelephone='" + numTelephone + '\'' +
                ", email='" + email + '\'' +
                ", sexe='" + sexe + '\'' +
                ", sucursale_id=" + sucursale_id +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", failed_attemps=" + failed_attemps +
                '}';
    }
}
