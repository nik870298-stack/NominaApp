public class Vendedor extends Empleado {

    private double ventasMensuales;
    private double porcentajeComision;


    public Vendedor() {
    }


    public Vendedor(String id, String nombre, double salarioBase, double ventasMensuales, double porcentajeComision) {
        super(id, nombre, salarioBase);
        this.ventasMensuales = ventasMensuales;
        this.porcentajeComision = porcentajeComision;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public String toString() {
        return super.toString() + "Vendedor{" +
                "ventasMensuales=" + ventasMensuales +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }


    //METODOS PROPIOS

    //METODO CALDULAR BONIFICACION POR META

    public double calcularBonificacionPorMeta(){
        if (ventasMensuales>5000000){
            double bono = ventasMensuales*0.10;
            System.out.println("Su bonificacion por ventas es de: " + bono);
        }
        return 0;
    }

    //METODO CALCULAR SALARIO (SOBRE ESCRITO)

    @Override
    public double calcularSalario() {
        double salarioTotal = salarioBase + (ventasMensuales * porcentajeComision) + calcularBonificacionPorMeta();
        return + salarioTotal;
    }


    @Override
    public String mostrasInfo(){
        return "SOY UN VENDEDOR: " + " ID: " + id + " Nombre: " + nombre + " SalarioBase: " + salarioBase + " Ventas Mensuales: " + " Porcentaje de Comision: " + porcentajeComision;
    }
}
