package ejercicioTrenes;

public class Locomotora  {
    private Integer velocidadLocomotora;
    private Integer pesoLocomotora;
    private Integer pesoMaximoArrastrar;



    public Integer getVelocidadLocomotora() {
        return velocidadLocomotora;
    }

    public void setVelocidadLocomotora(Integer velocidadLocomotora) {
        this.velocidadLocomotora = velocidadLocomotora;
    }

    public Integer getPesoLocomotora() {
        return pesoLocomotora;
    }

    public void setPesoLocomotora(Integer pesoLocomotora) {
        this.pesoLocomotora = pesoLocomotora;
    }

    public Integer getPesoMaximoArrastrar() {
        return pesoMaximoArrastrar;
    }

    public void setPesoMaximoArrastrar(Integer pesoMaximoArrastrar) {
        this.pesoMaximoArrastrar = pesoMaximoArrastrar;
    }

    public Boolean soyEficiente(){
       return this.getPesoMaximoArrastrar()>=(5*this.pesoLocomotora);
    }

    public Integer arrastreUtil(){
        return this.getPesoMaximoArrastrar() - this.getPesoLocomotora();
    }

}
