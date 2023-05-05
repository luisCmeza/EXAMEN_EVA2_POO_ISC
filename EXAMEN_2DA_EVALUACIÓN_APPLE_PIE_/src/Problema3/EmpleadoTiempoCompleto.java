package Problema3;



//Clase que hereda de Empleados
public class EmpleadoTiempoCompleto extends Empleados{
    
    //Ningún atributo nuevo declarado
    
    //Constructor default que hace la llamada al constructor de la clase padre
    public EmpleadoTiempoCompleto() {
        super();
    }
    
    /* Constructor con argumentos y que hace la llamda al csontructor de la clase 
    padre */
    public EmpleadoTiempoCompleto(String ID, String nombre, double salario) {
        super(ID, nombre, salario);
    }
    
 //-----------------------------------------------------------------------------
    
    //Override del método "calcularSalario de la clase padre abstracta Empleados
    @Override
    public double calcularSalario(){
        return salario;
    }
    
}
