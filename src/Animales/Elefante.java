public class Elefante implements Corredor{
    private Integer peso;


    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer kilos) {
        peso = kilos;
    }

    public void barritar(){
        System.out.println("prrr");
    }

    public void correr(Integer kilometros){
        peso = peso - kilometros;
    }
}
