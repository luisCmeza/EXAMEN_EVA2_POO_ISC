package Problema1;

public class Formula_3 extends Movimiento implements Captura {

    double distancia;

    //CONSTRUCTOR DEFAULT
    public Formula_3() {
        super();
    }

    public Formula_3(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
    }
    
    //USO DEL MÉTODO CALCULAR DISTANCIA DECLARADO EN LA CLASE MOVIMIENTO
    //FORMULA -> (Vf - Vo) / (2 * a)
    public double calcularDistancia() {
        distancia = ((getVelocidadFinal() - getVelocidadInicial()) / (2 * getAceleracion()));
        return distancia;
    }

    public void imprimirDatos() {
        System.out.println(distancia + "m.");
    }
}
