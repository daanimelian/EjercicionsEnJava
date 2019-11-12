public abstract class Empleado {
    private Integer diasPresente;

    public Integer sueldo(){ return this.neto();}
    protected abstract Integer neto();
}
