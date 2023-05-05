package Problema3;

//Angel Arizpe, Iram Arredondo, David Martínez y Luis Meza

//Angel Arizpe, Iram Arredondo, David Martínez y Luis Meza

public class Problema3 {

    public static void main(String[] args) {
        EmpleadoTiempoCompleto Empleado1 = new EmpleadoTiempoCompleto("1234", "John Cena", 300);
        System.out.println("ID: " + Empleado1.getID());
        System.out.println("Nombre: " + Empleado1.getNombre());
        System.out.println("Salario: " + Empleado1.calcularSalario());
        
        System.out.println("\n");
        
        EmpleadoTiempoParcial Empleado2 = new EmpleadoTiempoParcial("2048", "El Billy", 0, 200, 5);
        System.out.println("ID: " + Empleado2.getID());
        System.out.println("Nombre: " + Empleado2.getNombre());
        System.out.println("Pago por hora: " + Empleado2.getPagoPorHora());
        System.out.println("Horas trabajadas: " + Empleado2.getHorasTrabajadas());
        System.out.println("Salario: " + Empleado2.calcularSalario());
        
        System.out.println("\n");
        
        Administrador Administrador1 = new Administrador("0619", "Mi tío Pepe", 500, 50);
        System.out.println("ID: " + Administrador1.getID());
        System.out.println("Nombre: " + Administrador1.getNombre());
        System.out.println("Porcentaje del bono: " + Administrador1.getPorcentajeDelBono() + "%");
        System.out.println("Salario: " + Administrador1.calcularSalario());
    }
    
}
