package Problema1;

public class EXAMEN_2DA_EVALUACIÓN_APPLE_PIE {

    /*
 David, Angel, Iram, Carlos
     */
    public static void main(String[] args) {
        //VelocidadInicial - VelocidadFinal - Aceleración - Tiempo
        Formula_1 f1 = new Formula_1(10, 0, 20, 4);
        f1.calcularDistancia();
        f1.imprimirDatos();

        Formula_2 f2 = new Formula_2(10, 50, 0, 4);
        f2.calcularDistancia();
        f2.imprimirDatos();

        Formula_3 f3 = new Formula_3(10, 50, 20, 0);
        f3.calcularDistancia();
        f3.imprimirDatos();
    }

}
