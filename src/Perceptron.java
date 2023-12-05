public class Perceptron {
    private double[] pesos;
    private double aprendizaje; //Cuanto se mueven los pesos
    private predicciones predicciones;

    public Perceptron(int tamanoEntradas, double aprendizaje) {
        this.pesos = new double[tamanoEntradas];
        this.aprendizaje = aprendizaje;
        this.predicciones = new predicciones();

        // Inicializar pesos
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = Math.random() * 0.1;  // Valores pequeños para facilitar la convergencia
        }
    }

    private void entrenarInstanciaUnica(int[] entradas, int objetivo) {
        predicciones.entrenarInstanciaUnica(entradas, objetivo, pesos, aprendizaje);
    }

    // Entrenar el perceptrón
    public void entrenarP(Entrenamiento trainingData) {
        int[][] data = trainingData.getData();
        int[] objetivo = trainingData.getobjetivo();

        for (int epocas = 0; epocas < 1000; epocas++) {
            for (int i = 0; i < data.length; i++) {
                entrenarInstanciaUnica(data[i], objetivo[i]);
            }
        }
    }

    public double[] getPesos(){
        return pesos;
    }


}