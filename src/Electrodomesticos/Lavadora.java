package Electrodomesticos;

public class Lavadora extends Electrodomestico {
    private Integer carga = 5;

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Integer peso, Integer precioBase) {
        super.setColor(color);
        super.setConsumoEnergetico(consumoEnergetico);
        super.setPrecioBase(precioBase);
        this.setCarga(carga);
        super.setPeso(peso);
    }

    public Integer precioFinal() {
        if (carga < 30) {
            return super.precioFinal();
        } else {
            return super.precioFinal() + 50;
        }


    }
}
