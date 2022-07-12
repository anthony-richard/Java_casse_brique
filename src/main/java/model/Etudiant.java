package model;

public class Etudiant extends Utilisateur {

    private int noteGlobale;

    public Etudiant(String nom, String prenom, int noteGlobale) {
        super(nom, prenom);
        this.noteGlobale = noteGlobale;
    }
}
