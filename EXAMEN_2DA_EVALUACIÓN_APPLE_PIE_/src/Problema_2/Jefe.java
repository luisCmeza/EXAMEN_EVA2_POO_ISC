package Problema_2;

/*
 David, Angel, Iram, Carlos
 */

//heredar de la clase empleados e implementar de metodos 
public class Jefe extends Empleados implements Metodos{
  
     //constructores heredados de la clase empleados
    public Jefe() {
       super();
        setSalarioB(5000.0);
    }
    public Jefe(String nombre, String apellido, int edad, double salariob) {
        super(nombre, apellido, edad, salariob);
        this.salariob = salariob;
    }
    
    //-------------------------------------------------------------------------------
    
     //metodos para calcular el salario e imprimir los datos
    @Override
    public double CalcularSalario() {
        return getSalarioB();
    }

    @Override
    public void imprimirDatos() {
         System.out.println("DATOS:\n" +
                          "Nombre: " + getNombre() + "\n" +
                          "Apellido: " + getApellido() + "\n" +
                          "Edad: " + getEdad() + "\n" +
                          "Salario base: " + getSalarioB() + "\n" +
                          "Salario semanal: " + CalcularSalario());  
    }

}
