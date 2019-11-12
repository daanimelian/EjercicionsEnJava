package Electrodomesticos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Lavadora dream = new Lavadora(60, 00, 60000000);
        Television samsung = new Television(30000, "negro", "F", 40, false);

        System.out.println(dream.precioFinal());
        System.out.println(samsung.precioFinal());
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(dream);
        electrodomesticos.add(samsung);

        electrodomesticos.forEach(electrodomestico -> electrodomestico.precioFinal());
    }
}