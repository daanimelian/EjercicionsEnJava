package ejercicioTrenes;

public class  VagonPersona implements Vagon{

    private Double anchoVagon;
    private Double largoVagon;
    private Double cargaMaxima;

    public Integer capacidadDeVagon(){
      return (int) (anchoVagon<=2.5 ?
              largoVagon*8 :
              largoVagon*10);

    }

    @Override

    public Boolean soyLiviano(){
        return this.pesoMaximo()<2500;
    }
    public Double pesoMaximo() {

        return cargaMaxima*80;

    }

    public Double getAnchoVagon() {
        return anchoVagon;
    }

    public void setAnchoVagon(Double anchoVagon) {
        this.anchoVagon = anchoVagon;
    }

    public Double getLargoVagon() {
        return largoVagon;
    }

    public void setLargoVagon(Double largoVagon) {
        this.largoVagon = largoVagon;
    }
}
