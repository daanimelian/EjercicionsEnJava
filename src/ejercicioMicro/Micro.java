package ejercicioMicro;
import java.util.List;
import java.util.ArrayList;

public class Micro {
    private Integer cantidadSentados;
    private Integer cantidadParados;
    private List<Persona> pasajeros = new ArrayList<>();
    private Integer volumen;

    public void subiA(Persona persona){
        if (cantidadDePersonasEnElMicro()<capacidadTotal() && persona.aceptasSubir(this)) { pasajeros.add(persona);}
        else{ System.out.println("no se pueden subir mas personas al micro"); }
    }

    public void bajaA(Persona persona){
        if(cantidadDePersonasEnElMicro()>1) { pasajeros.remove(persona); }
        else{ System.out.println("No se puede bajar a la persona del micro");}
    }



    public Micro( Integer cantidadSentados, Integer cantidadParados, Integer volumen){
        this.cantidadParados = cantidadParados;
        this.cantidadSentados =cantidadSentados;
        this.volumen = volumen;
    }

    public Boolean tenesXLugaresLibres(Integer x){
        return this.lugaresLibres()>= x;
    }

    public Integer lugaresLibres(){
        return this.capacidadTotal()-this.cantidadDePersonasEnElMicro();
    }

    public Integer capacidadTotal(){
        return this.cantidadSentados + this.cantidadParados;
    }
    public Boolean tenesLugaresSentados(){
        return this.cantidadDePersonasEnElMicro() < this.cantidadSentados;

    }

    public Boolean sePuedeSubir(Persona persona){
      return  this.tenesLugar() && persona.aceptasSubir(this);
    }

    public Boolean tenesLugar(){
        return this.cantidadDePersonasEnElMicro() < this.capacidadTotal() ;
    }

    public Integer cantidadDePersonasEnElMicro(){
        return pasajeros.size();
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }
}
