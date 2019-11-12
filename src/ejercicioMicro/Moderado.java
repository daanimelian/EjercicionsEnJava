package ejercicioMicro;

public class Moderado implements Persona{
    private Integer x;
    public Boolean aceptasSubir(Micro micro) {
        return micro.tenesXLugaresLibres(x);
    }
}
