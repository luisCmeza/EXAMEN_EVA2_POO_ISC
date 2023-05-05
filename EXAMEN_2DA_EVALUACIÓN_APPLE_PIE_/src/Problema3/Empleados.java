package Problema3;



public abstract class Empleados {
    
    //Declaración de variables
    private String ID;
    private String nombre;
    protected double salario;
    
//------------------------------------------------------------------------------
    
    //Constructor default
    public Empleados(){
    this.ID = "----";
    this.nombre = "----";
    this.salario = 0;
    }
    
    //Constructor con argumentos
    public Empleados(String ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }
    
//------------------------------------------------------------------------------
    
    //Métodos get y set
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
//------------------------------------------------------------------------------
    
    //Meétodo abstracto que regresa el salario (no hay cálculo, solo lo regresa)
    //Se hará override de este método en las clases que hereden de esta
    public abstract double calcularSalario();
        
}
