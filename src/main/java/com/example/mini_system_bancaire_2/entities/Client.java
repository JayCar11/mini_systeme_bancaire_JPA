package com.example.mini_system_bancaire_2.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

@Entity
@Table(name = "client")
public class Client {

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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id_client;

    @Column(name = "salary")
    private double salary;

    @Column(name = "statut_matrimonial")
    private String statut_matrimonial;

    @Column(name = "date_de_naissance")
    private Calendar date_de_naissance;

    @Column(name = "code_conf")
    private int code_conf;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Gestionnaire gestionnaire;


    public int getCode_conf() {
        return code_conf;
    }

    public int getId_client() {
        return id_client;
    }

    public int getAge(){
        Date today = new Date();
        LocalDate localToday = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int todayYear = localToday.getYear();
        int clientYear = date_de_naissance.get(Calendar.YEAR);

        int age = todayYear - clientYear;

        if(date_de_naissance.get(Calendar.DAY_OF_YEAR) > localToday.getDayOfYear()){
            age--;
        }

        return age;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public String getStatut_matrimonial() {
        return statut_matrimonial;
    }

    public double getSalary() {
        return salary;
    }

    public Gestionnaire getGestionnaire() {
        return gestionnaire;
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

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStatut_matrimonial(String statut_matrimonial) {
        this.statut_matrimonial = statut_matrimonial;
    }

    public Calendar getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Calendar date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public void setCode_conf(int code_conf) {
        this.code_conf = code_conf;
    }

    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", adresse=" + adresse +
                ", numTelephone='" + numTelephone + '\'' +
                ", email='" + email + '\'' +
                ", sexe='" + sexe + '\'' +
                ", id_client=" + id_client +
                ", salary=" + salary +
                ", statut_matrimonial='" + statut_matrimonial + '\'' +
                ", date_de_naissance=" + date_de_naissance +
                ", code_conf=" + code_conf +
                ", gestionnaire=" + gestionnaire +
                '}';
    }
}
