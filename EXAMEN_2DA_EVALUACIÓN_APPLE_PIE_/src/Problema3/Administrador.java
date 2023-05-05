package Problema3;



//Clase que hereda de Empleados e implementa de la interfaz ElegibleParaBono
public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono {
    
    //Declaración de la variable porcentaje del abono para calcuar el salario final
    private double porcentajeDelBono;
    
    //Constructor default
    public Administrador() {
        super();
        this.porcentajeDelBono = 0;
    }
    
    //Constructor con argumentos
    public Administrador(String ID, String nombre, double salario, double porcentajeDelBono) {
        super(ID, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

//------------------------------------------------------------------------------
    
    //Métodos get y set
    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }
    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }
    
    //--------------------------------------------------------------------------
    
    /* Override del método calcularSalario que utiliza al método calcularBono
     y le suma ese porcentaje del salario al salario base */
    @Override
    public double calcularSalario(){
        return salario + calcularBono();
    }
    
    //El porcentaje se introduce en número entero y no decimal
    //El método se encarga de convertir el número a porcentaje dividiendo entre 100
    //Se obtiene un porcentaje del salario base que será el bono recibido
    @Override
    public double calcularBono(){
        return salario*(porcentajeDelBono/100);
    }
    
}
