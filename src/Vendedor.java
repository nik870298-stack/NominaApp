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


    //METODOS PROPIOS

    //METODO CALDULAR BONIFICACION POR META

    public double calcularBonificacionPorMeta(){

        return 0;
    }

    //METODO CALCULAR SALARIO (SOBRE ESCRITO)



    public double calcularSalario() {
        double salarioTotal = salarioBase + (ventasMensuales * porcentajeComision) + calcularBonificacionPorMeta();
        return salarioTotal;
    }
}
