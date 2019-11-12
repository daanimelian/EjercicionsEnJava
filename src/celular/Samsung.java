package celular;

public class Samsung implements Celulares{
    private Double duracionBateria=5.0;
    private String nombre;


    public void setNombre(String nombreDelCelular){
        nombre= nombreDelCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracionBateria(){
        return duracionBateria;
    }

    public void recargar(Double puntos){
        duracionBateria = duracionBateria + puntos;
                }

    public void llamar(Double minutos) {
        duracionBateria = duracionBateria - 0.25;
         }

    public boolean isCelularApagado(){
        return duracionBateria<=0;
        }

        }
