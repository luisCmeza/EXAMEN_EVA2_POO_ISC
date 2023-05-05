
package Problema1;


public interface Captura {
    //MÉTODOS GETTER AND SETTER DE TODOS LOS ATRIBUTOS DE LA CLASE MOVIMIENTO
    
    double getVelocidadInicial();
    void setVelocidadInicial(double velocidadInicial);
    
    double getVelocidadFinal();
    void setVelocidadFinal(double velocidadFinal);
    
    double getAceleracion();
    void setAceleracion(double aceleracion);
    
    double getTiempo();
    void setTiempo(double tiempo);
    
    //MÉTODO PARA IMPRIMIR LOS DATOS
    void imprimirDatos();
}
