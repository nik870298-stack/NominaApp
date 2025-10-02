public class Gerente extends Empleado{

    private double bonoFijo;
    private int empleadosACargo;

    public Gerente() {
    }

    public Gerente(String id, String nombre, double salarioBase, double bonoFijo, int empleadosACargo) {
        super(id, nombre, salarioBase);
        this.bonoFijo = bonoFijo;
        this.empleadosACargo = empleadosACargo;
    }

    public double getBonoFijo() {
        return bonoFijo;
    }

    public void setBonoFijo(double bonoFijo) {
        this.bonoFijo = bonoFijo;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }


    //METODOS PROPIOS

    //METODO CALCULAR INCENTIVO

    public double calcularIncentivoLiderazgo(){
        if(empleadosACargo>10){
            double incentivo = (salarioBase);
        }
        return 0;
    }
}
