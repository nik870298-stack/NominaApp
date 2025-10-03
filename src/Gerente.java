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

    @Override
    public String toString() {
        return super.toString() + "Gerente{" +
                "bonoFijo=" + bonoFijo +
                ", empleadosACargo=" + empleadosACargo +
                '}';
    }


    //METODOS PROPIOS

    //METODO CALCULAR INCENTIVO

    public double calcularIncentivoLiderazgo(){
        if(empleadosACargo>10){
            double incentivo = (salarioBase*0.5);
            System.out.println(incentivo);
        }
        return 0;
    }


    //METODO CALCULAR SALARIO
    @Override
    public double calcularSalario(){
        double salarioTotal = salarioBase + bonoFijo + calcularIncentivoLiderazgo();
        return +salarioTotal;
    }

    @Override
    //METODO MOSTRAR INFORMACION
    public String mostrasInfo(){
        return "SOY GERENTE: " + " ID: " + id + " Nombre: " + nombre + " SalarioBase: " + salarioBase + " Bono Fijo: " + bonoFijo + " Empleados a su cargo: " + empleadosACargo;
    }
}
