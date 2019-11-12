import ejercicioTrenes.Locomotora;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Deposito {

    Locomotora unaLocomotora;
    List<Tren> trenes = new ArrayList<>();
    List<Locomotora> locomotorasSueltas = new ArrayList<>();

    public void agregarTrenaDeposito(Tren unTren){
        trenes.add(unTren);
    }
    public void agregarLocomotoraADeposito(Locomotora unaLocomotora){locomotorasSueltas.add(unaLocomotora);}

    public void vagonesMasPesadosDelDeposito(){
        this.trenes.stream().map(tren -> tren.vagonMasPesado()).collect(Collectors.toList());
    }

    public Boolean necesitoConductorExperimentado(){
        return this.trenes.stream().anyMatch(tren -> tren.esEstaFormacionCompleja());
    }

    public void agregarLocomotoraAFormacion(Tren unTren){

        if(unTren.puedoMoverme()==false){
         unTren.agregarLocomotoraAFormacion( this.locomotorasSueltas.stream().filter(locomotora -> locomotora.getPesoMaximoArrastrar() >= unTren.kilosDeEmpujeQueMeFaltan()).findAny().get());
            }

        }
    }

