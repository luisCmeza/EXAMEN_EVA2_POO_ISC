package Problema1;

public abstract class Movimiento implements Captura {

    //ATRIBUTOS DE LA CLASE
    private double velocidadInicial;
    private double velocidadFinal;
    private double aceleracion;
    private double tiempo;
    
    //CLASE DEFAULT
    public Movimiento() {
        velocidadInicial = 1;
        velocidadFinal = 1;
        aceleracion = 1;
        tiempo = 1;
    }
    
    //CLASE CON ARGUMENTOS
    public Movimiento(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo) {
        this.velocidadInicial = velocidadInicial;
        this.velocidadFinal = velocidadFinal;
        this.aceleracion = aceleracion;
        this.tiempo = tiempo;
    }
    
    //IMPLEMENTACIÓN DE LOS MÉTODOS GETTER AND SETTER DEL INTERFAZ CAPTURA
    @Override
    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    @Override
    public void setVelocidadInicial(double velocidadInicial) {
    }

    @Override
    public double getVelocidadFinal() {
        return velocidadFinal;
    }

    @Override
    public void setVelocidadFinal(double velocidadFinal) {
        
    }

    @Override
    public double getAceleracion() {
        return aceleracion;
    }

    @Override
    public void setAceleracion(double aceleracion) {
        
    }

    @Override
    public double getTiempo() {
        return tiempo;
    }

    @Override
    public void setTiempo(double tiempo) {
        
    }
    
    //MÉTODO PARA IMPRIMIR DATOS
    public void imprimirDatos(){
        
    }
    
    //MÉTODO ABSTRACTO PARA CALCULAR LA DISTANCIA
    abstract public double calcularDistancia();
}
