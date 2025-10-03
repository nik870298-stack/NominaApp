import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      menuNomina();
    }


    public static void menuNomina(){

        List<Empleado> listaEmpelados = new ArrayList<>();
        Scanner leer = new Scanner(System.in);

        do{
            System.out.println("===SISTEMA DE NÓMINA TECHMARKET===");
            System.out.println("1. Registrar Vendedor");
            System.out.println("2. Registrar Gerente");
            System.out.println("3. Listar Empleados");
            System.out.println("4. Calcular nómina total");
            System.out.println("5. Mostrar Empelado con mayo salario");
            System.out.println("6. Calcular salario promedio");
            System.out.println("7. Buscar empleado por ID");
            System.out.println("8.Mostrar cantidad de Vendedores y Gerentes");
            System.out.println("9. Salir");

            int opcion = leer.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("Ingrese el id del vendedor: ");
                    String idVendedor = leer.next();
                    System.out.println("Ingrese el nombre del vendedor: ");
                    String nombreVendedor = leer.next();
                    System.out.println("Ingrese el salario base del vendedor: ");
                    double salarioBaseVendedor = leer.nextDouble();
                    System.out.println("Ingrese las ventas Mensuales: ");
                    double ventasMensualesV = leer.nextDouble();
                    System.out.println("Porcentaje de Comision: ");
                    double comisionPorcentaje = leer.nextDouble();
                    listaEmpelados.add(new Vendedor(idVendedor, nombreVendedor, salarioBaseVendedor, ventasMensualesV, comisionPorcentaje));
                    break;
                case 2:
                    System.out.println("Ingrese el id del gerente: ");
                    String idGerente = leer.next();
                    System.out.println("Ingrese el nombre del vendedor: ");
                    String nombreGerente = leer.next();
                    System.out.println("Ingrese el salario base del vendedor: ");
                    double salarioBaseGerente = leer.nextDouble();
                    System.out.println("Ingrese el bono fijo: ");
                    double fijoBono = leer.nextDouble();
                    System.out.println("Empleados a su cargo: ");
                    int empleadosCargo = leer.nextInt();
                    listaEmpelados.add(new Gerente(idGerente, nombreGerente, salarioBaseGerente, fijoBono, empleadosCargo));
                    break;
                case 3:
                    for(Empleado N: listaEmpelados){
                        System.out.println(N);
                    }
                    break;
                case 4:
                    double total = 0 ;
                    for (Empleado N: listaEmpelados) total += N.calcularSalario();
                    System.out.println("La nomina total de todos los empelados es de: " +total);
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Digite el id del empleado que quiere Buscar: ");
                    String idE = leer.next();

                    boolean extente = false;
                    for (Empleado N: listaEmpelados){
                        if (N.getId() == idE){
                            System.out.println(N);
                        }
                        extente = true;
                        System.out.println("No existe ese Empelado");
                    }
                    if(!extente)
                        System.out.println("No existe ese Empleado");
                    break;
                case 8:

                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }while(true);
    }
}