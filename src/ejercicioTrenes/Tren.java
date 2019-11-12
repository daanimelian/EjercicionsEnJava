import ejercicioTrenes.Locomotora;
import ejercicioTrenes.Vagon;
import ejercicioTrenes.Locomotora;
import ejercicioTrenes.VagonPersona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tren {
    List<Vagon> vagones = new ArrayList<>();
    List<Locomotora> locomotoras = new ArrayList<>();

    public void agregarVagonesAFormacion( Vagon parteDeTren){
        vagones.add(parteDeTren);
    }

    public void agregarLocomotoraAFormacion(Locomotora locomotora){
        locomotoras.add(locomotora);
    }


    public Integer cantidadDePasajerosDeLaFormacion(){
        return vagones.stream().map(vagon -> vagon.capacidadDeVagon()).reduce(0, Integer::sum);
    }

    public Integer cantidadDeVagonesLivianos(){
       return (int) (this.vagones.stream().filter(vagon -> vagon.soyLiviano()).count());
    }

    public void velocidadMaximaDeFormacion(){
        this.locomotoras.stream().min(Comparator.comparing(Locomotora::getVelocidadLocomotora));
    }
    public void formacionEsEficiente(){
        this.locomotoras.stream().allMatch(locomotora -> locomotora.soyEficiente());
    }
    public Boolean puedoMoverme(){
        return this.locomotoras.stream().map(locomotora -> locomotora.arrastreUtil()).reduce(0, Integer::sum) >= this.vagones.stream().map(vagon -> vagon.pesoMaximo()).reduce(0.0, Double::sum);
    }
    public Double kilosDeEmpujeQueMeFaltan(){
        if(this.pesoMaximoVagonesDeLaFormacion()<this.arrastreMaximoDeLaFormacion()){
            return 0.0;
        }

        else{

            return this.pesoMaximoVagonesDeLaFormacion()-this.arrastreMaximoDeLaFormacion();
        }

    }

    public Double pesoMaximoVagonesDeLaFormacion(){ return (this.vagones.stream().map(vagon -> vagon.pesoMaximo()).reduce(0.0, Double::sum));
    }

    public Double pesoDeLaFormacionCompleta(){
        return this.pesoMaximoVagonesDeLaFormacion()+ this.locomotoras.stream().map(locomotora -> locomotora.getPesoLocomotora()).reduce(0,Integer::sum);
    }

    public Integer arrastreMaximoDeLaFormacion(){return this.locomotoras.stream().map(locomotora -> locomotora.getPesoMaximoArrastrar()).reduce(0,Integer::sum);}

    public Vagon vagonMasPesado(){
        return this.vagones.stream().max(Comparator.comparing(Vagon::pesoMaximo)).get();
    }

    public Boolean esEstaFormacionCompleja(){
        return this.vagones.stream().count()+this.locomotoras.stream().count() > 20 || this.pesoDeLaFormacionCompleta()>10000;

    }
}
