package celular;

public class Claro implements Compania {
    public double gastos(Double minutos) {
        return 0.50*minutos + (0.50*minutos)*0.21;
    }
}
