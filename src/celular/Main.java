package celular;
public class Main {
    public static void main(String args[]) {
        Iphone iphoneCatalina = new Iphone();
        Samsung samsungJuliana = new Samsung();

        Personal empresapersonal= new Personal();
        Claro empresaclaro = new Claro();

        Persona catalina = new Persona("Catalina", iphoneCatalina, empresapersonal);
        Persona juliana = new Persona("Juliana", samsungJuliana, empresaclaro);

        catalina.llamarA(juliana,5.0);
        juliana.llamarA(catalina,40.0);
        catalina.llamarA(juliana, 100.0);

        System.out.println("El nivel de bateria del iphone es: " + iphoneCatalina.getDuracionBateria());
        System.out.println("El nivel de bateria del samsung es: " + samsungJuliana.getDuracionBateria());
        System.out.println("El celular de Catalina esta apagado? "+iphoneCatalina.isCelularApagado());
        System.out.println("El celular de Juliana esta apagado? "+samsungJuliana.isCelularApagado());
        System.out.println("Los gastos de "+juliana.getNombrePersona()+" son : "+juliana.getGastos());
        System.out.println("Los gastos de "+catalina.getNombrePersona()+" son : "+catalina.getGastos());
    }
}
