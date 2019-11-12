package ejercicioMicro;

public class Claustrofobico implements Persona {
    public Boolean aceptasSubir(Micro micro){
        return micro.getVolumen()> 120;
    }
}
