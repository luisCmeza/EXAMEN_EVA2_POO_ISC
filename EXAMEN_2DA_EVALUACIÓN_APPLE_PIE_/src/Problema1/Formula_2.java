package Problema1;

public class Formula_2 extends Movimiento implements Captura {

    double distancia;
    
    //CONSTRUCTOR DEFAULT
    public Formula_2() {
        super();
    }

    //CONSTRUCTOR CON ARGUMENTOS PARA LA CLASE FORMULA_2
    public Formula_2(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
    super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
    }

    //USO DEL MÉTODO CALCULAR DISTANCIA DECLARADO EN LA CLASE MOVIMIENTO
    //FORMULA -> ((Vo * Vf) / 2) * t
    public double calcularDistancia() {
        distancia = ((getVelocidadInicial() + getVelocidadFinal()) / 2) * getTiempo();
        return distancia;
    }

    public void imprimirDatos() {
        System.out.println(distancia + "m.");
    }
}
