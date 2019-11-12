package celular;
public class Personal implements Compania {

    public double gastos(Double minutos) {
      if (minutos<10.0){
          return 0.70;
      }
      else {
          return (minutos-10)*0.4 + 0.70;
      }
    }
}


