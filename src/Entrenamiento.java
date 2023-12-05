import java.util.Arrays;

public class Entrenamiento {

    private int[][] data;
    private int[] objetivo ;

    public Entrenamiento(int[][] data, int[] objetivo ) {
        this.data = data;
        this.objetivo  = objetivo ;
    }

    public int[][] getData() {
        return data;
    }

    public int[] getobjetivo () {
        return objetivo ;
    }

    public void imprimir() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]) + " =    " + objetivo [i]);
        }
    }

    // Método para crear el conjunto de entrenamiento
    public static Entrenamiento crearDatosEntrenamientoAnd2() {
        int[][] datosEntrenamiento  = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        int[] objetivo  = {0, 0, 0, 1}; // Resultados esperados
        return new Entrenamiento(datosEntrenamiento , objetivo );
    }


    public static Entrenamiento crearDatosEntrenamientoAnd3() {
        int[][] datosEntrenamiento  = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1}
        };
        int[] objetivo  = {0, 0, 0, 0, 0, 0, 0, 1};
        return new Entrenamiento(datosEntrenamiento , objetivo );
    }


    public static Entrenamiento crearDatosEntrenamientoOr2() {
        int[][] datosEntrenamiento  = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        int[] objetivo  = {0, 1, 1, 1};
        return new Entrenamiento(datosEntrenamiento , objetivo );
    }


    public static Entrenamiento crearDatosEntrenamientoOr3() {
        int[][] datosEntrenamiento  = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 1}
        };
        int[] objetivo  = {0, 1, 1, 1, 1, 1, 1, 1};
        return new Entrenamiento(datosEntrenamiento , objetivo );
    }

}
