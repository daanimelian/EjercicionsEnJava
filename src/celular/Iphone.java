package celular;

public class Iphone implements Celulares {
    private double duracionBateria=5.0;

    public double getDuracionBateria(){
        return duracionBateria;
    }

    public void recargar(Double puntos){
        duracionBateria = duracionBateria + puntos;
    }

    public void llamar(Double minutos) { duracionBateria = duracionBateria - (minutos * 0.1); }

    public boolean isCelularApagado(){
        return duracionBateria<=0;
    }
}
