public class predicciones {

    public int predicciones(int[] entradas, double[] pesos) {
        // Calcular la suma ponderada
        double sum = 0;
        for (int i = 0; i < pesos.length; i++) {
            sum += entradas[i] * pesos[i];
        }

        // Aplicar la función de activación
        return (sum >= 0.5) ? 1 : 0;
    }

    public void entrenarInstanciaUnica(int[] entradas, int objetivo, double[] pesos, double aprendizaje) {

        int prediccion = predicciones(entradas, pesos);// Realizar la predicción
        int error = objetivo - prediccion;    // Calcula el error

        // Actualiza los pesos a partir error y la tasa de aprendizaje
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] += aprendizaje * error * entradas[i];
        }
    }



}
