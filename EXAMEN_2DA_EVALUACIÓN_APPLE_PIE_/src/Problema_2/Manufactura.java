package Problema_2;

/*
David, Angel, Iram, Carlos
 */

//heredar de la clase empleados e implementar de metodos 
public class Manufactura extends Empleados implements Metodos{

    int hora;
    
    //constructores heredados de la clase empleados
    public Manufactura() {
       super();
        salariob = 40.0;
    }
    public Manufactura(String nombre, String apellido, int edad, double salariob, int hora) {
        super(nombre, apellido, edad, salariob);
        this.salariob = salariob;
        this.hora = hora;
    }
//-----------------------------------------------------------------------------------
   
    //metodos para calcular el salario e imprimir los datos
    @Override
    public double CalcularSalario() {
        return (hora * salariob);
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
