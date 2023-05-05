package Problema1;

public class Formula_1 extends Movimiento implements Captura {

    double distancia;
    
    //CONSTRUCTOR DEFAULT
    public Formula_1() {
        super();
    }
    
    //CONSTRUCTOR CON ARGUMENTOS PARA LA CLASE FORMULA_1
    public Formula_1(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
    }
    
    //USO DEL MÉTODO CALCULAR DISTANCIA DECLARADO EN LA CLASE MOVIMIENTO
    //FORMULA -> (Vo * t)+( (a * t^2) / 2) 
    public double calcularDistancia() {
        distancia = (getVelocidadInicial() * getTiempo()) + ((getAceleracion() * (Math.pow(getTiempo(), 2))) / 2);
        return distancia;
    }

    public void imprimirDatos() {
        System.out.println(distancia + " m.");
    }
}
