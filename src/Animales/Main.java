public class Main {
    public static void main(String[]args){
        Elefante dumbo = new Elefante();
        dumbo.setPeso(150);
        Jirafa marty = new Jirafa();
        marty.setPeso(150);
        Doctor who = new Doctor();

        who.hacerRutina(dumbo, 10);

        who.hacerRutina(marty, 10);

        System.out.println("El peso de dumbo es:" + dumbo.getPeso());

        System.out.println("El peso de Marty es:" + marty.getPeso());

    }
}
