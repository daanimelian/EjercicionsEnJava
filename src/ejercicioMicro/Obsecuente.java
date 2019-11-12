package ejercicioMicro;

public class Obsecuente implements Persona {
    private Persona jefe;
    public Boolean aceptasSubir(Micro micro) {
        return getJefe().aceptasSubir(micro);
    }

    public Persona getJefe() {
        return jefe;
    }

    public void setJefe(Persona jefe) {
        this.jefe = jefe;
    }
}
