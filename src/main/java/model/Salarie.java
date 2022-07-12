package model;

public class Salarie extends Utilisateur implements Mensualisable{
    int salaireAnnuel;

    public Salarie(int salaireAnnuel) {
        this.salaireAnnuel = salaireAnnuel;
    }

    @Override
    public int getCoutMensuel() {
        return salaireAnnuel / 12;
    }
}
