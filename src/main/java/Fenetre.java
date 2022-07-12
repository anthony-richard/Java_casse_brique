import model.cassebrique.Balle;
import model.cassebrique.Rectangle;

import javax.swing.*;
import java.awt.*;

public class Fenetre extends Canvas {
    //Propriétés
    //Dimensions de la fenetre
    private int largeur;
    private int hauteur;

    public Fenetre(int largeur, int hauteur) {

        this.largeur = largeur;
        this.hauteur = hauteur;

        //fenetre principale
        JFrame fenetre = new JFrame("Casse brique");
        //On récupère le panneau de la fenetre principale
        JPanel panneau = (JPanel) fenetre.getContentPane();
        //On définie la hauteur / largeur de l'écran
        panneau.setPreferredSize(new Dimension(largeur, hauteur));
        setBounds(0, 0, largeur, hauteur);
        //On ajoute cette classe (qui hérite de Canvas) comme composant du panneau principal
        panneau.add(this);
        fenetre.pack();
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenetre.requestFocus();

        //On indique que le raffraichissement de l'ecran doit être fait manuellement.
        createBufferStrategy(2);
        setIgnoreRepaint(true);
        this.setFocusable(false);

        demarrer();
    }


    public void demarrer() {
        //on démarre le jeu
        //boucle infinie

        Balle[] tableauBalle = new Balle[10];
        Rectangle rectangle = new Rectangle(10,10, Color.GREEN,30,50);

        for(int i = 0; i < 10; i++){
            tableauBalle[i] = new Balle(
                    (int)(Math.random() * largeur),
                    (int)(Math.random() * hauteur),
                    (int)(Math.random() * 4 + 1),
                    (int)(Math.random() * 4 + 1),
                    (20)
            );
        }

        while (true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();
            dessin.setColor(Color.WHITE);
            dessin.fillRect(0,0,largeur,hauteur);
            rectangle.dessinner(dessin);

            for(Balle balle : tableauBalle) {
                balle.mouvement(largeur,hauteur);
                balle.dessinner(dessin);
            }

            dessin.dispose();
            getBufferStrategy().show();

            //pause de quelques milisecondes afin de n'effectuer que 60 raffraichissements par seconde
            try {
                Thread.sleep(1000 / 60);
            } catch (Exception e) {
            }
        }
    }
}