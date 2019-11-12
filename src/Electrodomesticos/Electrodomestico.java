package Electrodomesticos;

public class Electrodomestico extends Object {
    protected Integer precioBase = 100;
    protected String color = "Blanco";
    protected String consumoEnergetico = "F";
    private Integer peso = 5;
    private Integer varPrecioFinal=0;

    public Electrodomestico(Integer precioBase, String color, String consumoEnergetico, Integer peso){
        this.setPrecioBase(precioBase);
        this.setColor(color);
        this.setConsumoEnergetico(consumoEnergetico);
        this.setPeso(peso);
    }

    public Electrodomestico(){
        this.setPrecioBase(precioBase);
        this.setColor(color);
        this.setConsumoEnergetico(consumoEnergetico);
    }

    public Electrodomestico(Integer precioBase, String color){
        this.setConsumoEnergetico(consumoEnergetico);
        this.setColor(color);
        this.setPrecioBase(precioBase);
    }

    String colores [] = {"blanco", "negro", "azul", "gris", "rojo"};

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public Integer precioFinal() {
        switch (consumoEnergetico) {
            case "A":
                varPrecioFinal=precioBase + 100;
                break;
            case "B":
                varPrecioFinal=precioBase + 80;
                break;
            case "C":
                varPrecioFinal=precioBase + 60;
                break;
            case "D":
                varPrecioFinal=precioBase + 50;
                break;
            case "E":
                varPrecioFinal=precioBase + 30;
                break;
            case "F":
                varPrecioFinal=precioBase + 10;
                break;
        }
        if (getPeso() <= 19) {
            varPrecioFinal=varPrecioFinal + 10;
        } else if (getPeso() >= 20 && getPeso() <= 49) {
            varPrecioFinal=varPrecioFinal+ 50;
        } else if (getPeso() >= 50 && getPeso() <= 79) {
            varPrecioFinal=varPrecioFinal+ 80;
        } else if (getPeso() >= 80) {
            varPrecioFinal=varPrecioFinal+ 100;
        }


        return varPrecioFinal;

    }


    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
