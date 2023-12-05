
public class Main {
    public static void main(String[] args) {

        Print print = new Print();

        // compuerta AND (2 entradas)
        // Crear y entrenar
        int tamanoEntradasAnd2 = 2;
        double tasaAprendizajeAnd2  = 0.1;
        Perceptron andPerceptron2 = new Perceptron(tamanoEntradasAnd2, tasaAprendizajeAnd2 );
        andPerceptron2.entrenarP(Entrenamiento.crearDatosEntrenamientoAnd2());

        // imprimir resultados
        System.out.println("AND (2 entradas):");
        Entrenamiento.crearDatosEntrenamientoAnd2().imprimir();
        print.imprimirP(andPerceptron2.getPesos());
        print.imprimirP2(andPerceptron2.getPesos());



        // compuerta AND (3 entradas)
        int tamanoEntradasAnd3  = 3;
        double tasaAprendizajeAnd3  = 0.1;
        Perceptron andPerceptron3 = new Perceptron(tamanoEntradasAnd3 , tasaAprendizajeAnd3 );
        andPerceptron3.entrenarP(Entrenamiento.crearDatosEntrenamientoAnd3());



        // imprimir resultados
        System.out.println("\nAND (3 entradas):");
        Entrenamiento.crearDatosEntrenamientoAnd3().imprimir();
        print.imprimirP(andPerceptron3.getPesos());
        print.imprimirP3(andPerceptron3.getPesos());

        //compuerta OR (2 entradas)
        int tamanoEntradasOr2  = 2;
        double tasaAprendizajeOr2  = 0.1;
        Perceptron orPerceptron2 = new Perceptron(tamanoEntradasOr2, tasaAprendizajeOr2 );
        orPerceptron2.entrenarP(Entrenamiento.crearDatosEntrenamientoOr2());

        // imprimir resultados
        System.out.println("\nOR (2 entradas):");
        Entrenamiento.crearDatosEntrenamientoOr2().imprimir();
        print.imprimirP(orPerceptron2.getPesos());
        print.imprimirP2(orPerceptron2.getPesos());

        //compuerta OR (3 entradas)
        int tamanoEntradasOr3  = 3;
        double tasaAprendizajeOr3  = 0.1;
        Perceptron orPerceptron3 = new Perceptron(tamanoEntradasOr3 , tasaAprendizajeOr3 );
        orPerceptron3.entrenarP(Entrenamiento.crearDatosEntrenamientoOr3());

        // imprimir resultados
        System.out.println("\nOR (3 entradas):");
        Entrenamiento.crearDatosEntrenamientoOr3().imprimir();
        print.imprimirP(orPerceptron3.getPesos());
        print.imprimirP3(orPerceptron3.getPesos());


    }

}


