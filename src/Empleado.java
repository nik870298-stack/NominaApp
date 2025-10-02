public class Empleado {

    protected String id;
    protected String nombre;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }



    //METODOS PROPIOS

    //METODO CALCULAR SALARIO

    public double calcularSalario(){
        return salarioBase;
    }


    //METODO MOSTRAR INFORMACION
    public String mostrasInfo(){
        return " ID: " + id + " Nombre: " + nombre + " SalarioBase: " + salarioBase;
    }
}
