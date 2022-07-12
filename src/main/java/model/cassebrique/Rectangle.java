package model.cassebrique;

import java.awt.*;

public class Rectangle extends Sprite implements Dessinable {
    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    private int hauteur;

    public Rectangle(int x, int y, Color couleur, int hauteur, int largeur) {
        super(x,y,couleur,largeur);
        this.hauteur = hauteur;

    }

    public Rectangle(int x, int y, int hauteur, int largeur) {
        super(x,y,Color.CYAN, largeur);
        this.hauteur = hauteur;

    }

    @Override
    public void dessinner(Graphics2D dessin) {
        dessin.setColor(getCouleur());
        dessin.fillRect(getX(), getY(), this.getLargeur(),this.getHauteur());
    }
}
