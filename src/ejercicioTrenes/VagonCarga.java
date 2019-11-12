package ejercicioTrenes;

public class VagonCarga implements Vagon {

    private Double cargaMaxima;

    @Override
    public Double pesoMaximo(){
        return cargaMaxima+160.0;
    }

    @Override
    public Integer capacidadDeVagon() {
        return 0;
    }
    public Boolean soyLiviano(){
        return this.pesoMaximo()<2500;
    }

    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
