package Electrodomesticos;

public class Television extends Electrodomestico {
    private Integer resolucion;
    private Boolean isSmart;

    public Television(Integer precioBase, String color, String consumoEnergetico, Integer resolucion, Boolean isSmart) {
        super.setColor(color);
        super.setConsumoEnergetico(consumoEnergetico);
        super.setPrecioBase(precioBase);
        this.setResolucion(resolucion);
        this.setSmart(isSmart);
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }


    public Integer precioFinal() {

        if (resolucion >= 40 && isSmart==Boolean.TRUE) {
            return (super.precioFinal() + super.precioFinal()*(40 / 100) + 50);
        } else if (resolucion < 40 && isSmart==Boolean.TRUE) {
            return (super.precioFinal()+50);
        }

        else{
            return super.precioFinal();
        }


    }

    public Boolean getSmart() {
        return isSmart;
    }

    public void setSmart(Boolean smart) {
        isSmart = smart;
    }
}
