package model;

public class Batiment implements Mensualisable{

    int surface;
    int coutMetreCarre;

    public Batiment(int surface, int coutMetreCarre) {
        this.surface = surface;
        this.coutMetreCarre = coutMetreCarre;
    }

    @Override
    public int getCoutMensuel() {
        return surface * coutMetreCarre;
    }
}
