package Problema3;



//Clase que hereda de Empleados
public class EmpleadoTiempoParcial extends Empleados{
    
    //Se declaran las variables pagoPorHora y horasTrabajdas propias de esta clase
    private double pagoPorHora;
    private int horasTrabajadas;
   
//---------------------------------------------------------------
    
    //Constructor default y que hace la llamada al constructor de la clase padre
    public EmpleadoTiempoParcial() {
        super();
        this.pagoPorHora = 0;
        this.horasTrabajadas = 0;
    }
    
    /* Constructor con argumentos y que hace la llamda al constructor de la clase
    padre */
    public EmpleadoTiempoParcial(String ID, String nombre, double salario, double pagoPorHora, int horasTrabajadas) {
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
//------------------------------------------------------------------------------
    
    //Métodos get y set
    public double getPagoPorHora() {
        return pagoPorHora;
    }
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
//------------------------------------------------------------------------------
    
    //Override del método calcularSalario de la clase padre abstracta Empleados
    //Multiplica las horas trabajadas por el pago de cada hora para obtener el salario
    @Override
    public double calcularSalario(){
        return salario = pagoPorHora * horasTrabajadas;
    }
   
}
