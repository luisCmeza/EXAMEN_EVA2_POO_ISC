package Problema_2;

/*
 David, Angel, Iram, Carlos
 */

public class problema_2 extends Empleados{
    
    public static void main (String [] argrs){
        
        //creacion de los objetos de cada clase y la llamada al metodo para imprimir los datos
        Manufactura man = new Manufactura("Juanito", "Banana", 25, 40.0, 5);
        man.imprimirDatos();
        
       Apoyo ap = new Apoyo("Pedro", "Hernandez", 30, 50.0, 6);
        System.out.println("");
        ap.imprimirDatos();
        
        Jefe jef = new Jefe("David", "Espinoza", 20, 10000);
        System.out.println("");
        jef.imprimirDatos();
    }

}
