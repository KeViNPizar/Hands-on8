import java.util.Arrays;

public class Print {

    public void imprimirP(double[] pesos) {
        System.out.println("Pesos finales: " + Arrays.toString(pesos));

    }

    public void imprimirP2(double[] pesos) {
        System.out.println("Unidad de suma: Σ = x1 * "+ pesos[0]+ " + " + " x2 "+ "* "+ pesos[1]  );
    }

    public void imprimirP3(double[] pesos) {
        System.out.println("Unidad de suma: Σ = x1 * "+ pesos[0]+ " + " + " x2 "+ "* "+ pesos[1]+ " + "+ " x3 "+ "* "+ pesos[2]  );
    }

}
