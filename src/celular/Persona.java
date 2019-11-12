package celular;
public class Persona {
    private Celulares unCelular;
    private String nombrePersona;
    private Compania unaCompania;
    private double gastos=0.0;

    public Persona(String nombrePersona, Celulares unCelular, Compania unaCompania){
        this.setUnCelular(unCelular);
        this.setUnaCompania(unaCompania);
        this.setNombrePersona(nombrePersona);
    }

    public void setNombrePersona(String nombreDePersona){
        nombrePersona= nombreDePersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void llamarA(Persona otraPersona, Double duracion){ this.getUnCelular().llamar(duracion); otraPersona.getUnCelular().llamar(duracion); this.actualizacionGastos(duracion); }

    public void actualizacionGastos(Double duracion){ gastos=gastos+this.getUnaCompania().gastos(duracion); }

    public Double getGastos() { return gastos; }

    public Celulares getUnCelular() { return unCelular; }

    public void setUnCelular(Celulares unCelular) { this.unCelular = unCelular; }

    public void setUnaCompania(Compania unaCompania){this.unaCompania = unaCompania;}

    public Compania getUnaCompania() { return unaCompania;}


}
