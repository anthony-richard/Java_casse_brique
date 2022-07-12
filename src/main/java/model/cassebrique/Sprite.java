package model.cassebrique;

import java.awt.*;

public class Sprite {
    private int x;
    private int y;
    private Color couleur;

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    private int largeur;

    public Sprite(int x, int y, Color couleur, int largeur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
        this.largeur= largeur;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}
