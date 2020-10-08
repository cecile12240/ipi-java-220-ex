package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Employe {

    private String nom;
    private String prenom;
    private String matricule;
    private LocalDate dateEmbauche;
    private Double salaire;

    public Employe(){ // constructeur par défaut java

    }
    public Employe (String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire){ // constructeur perso
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }
    // getters setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }
    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public Double getSalaire(){
        return salaire;
    }
    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }
    public final Integer gteNombreAnneeAnciennete(){
        return LocalDate.now().getYear() - dateEmbauche.getYear();

    }
    public void setDateEmbauche(){
        // vérifie que la date d'embauche est valide, qu'elle n'est pas égale à null et qu'elle n'est pas ultérieure à la date du jour
        if(dateEmbauche != null && dateEmbauche.isAfter(LocalDate.now())){
            throw new Exception("La date d'embauche ne peut pas être supérieure à la date courante");
        }
        this.dateEmbauche = dateEmbauche;
    }
}
