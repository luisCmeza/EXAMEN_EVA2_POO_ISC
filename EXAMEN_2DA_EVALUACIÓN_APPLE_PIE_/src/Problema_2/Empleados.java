package Problema_2;

/*
 David, Angel, Iram, Carlos
 */
//clase abstracta de la cual heredaran las otras clases
public abstract class Empleados implements Capturando{
    
    //Variables
    private String nombre;
    private String apellido;
    private int edad;
    protected double salariob;

    //-------------------------------------------------------------
    
    //constructores default y con argumentos
    public Empleados() {
        nombre = "-------";
        apellido = "------";
        edad = 0;
        salariob = 0.0;
    }
    public Empleados(String nombre, String apellido, int edad, double salariob) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salariob = salariob;
    }
    
    //-------------------------------------------------------------------------------
    
    //metodos get y set
     @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public int getEdad() {
        return edad;
    }
    @Override
    public void setEdad(int nombre) {
        this.edad = edad;
    }
    @Override
    public double getSalarioB() {
        return salariob;
    }
    @Override
    public void setSalarioB(double salariob) {
        this.salariob = salariob;
    }

}
