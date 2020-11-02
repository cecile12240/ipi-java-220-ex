package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Technicien extends Employe {

    private Integer grade;

    public Technicien(){

    }
    public Technicien(String nom, String prenom, String matricule, LocalDate dateEmbauche, Double salaire) throws TechnicienException {
        super(nom, prenom, matricule, dateEmbauche, salaire);
        this.setGrade(grade);
    }

    @Override
    public Double getPrimeAnnuelle() {
        return null;
    }

    public Integer getGrade(){
        return grade;
    }

    public void setGrade(Integer grade) throws TechnicienException {
        if(grade <= 0 || grade > 5) {
            throw new TechnicienException(TechnicienException.GRADE, this, grade);
        }
        this.grade = grade;
    }
}
