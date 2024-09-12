import java.util.*;
public class Main {
    public static void main(String[] args) {
        List <Vehiculos> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean val = true;

        System.out.println("Bienvenido a su lista de vehiculos");
        while(val){
            int op;
            System.out.println("\nQue desea hacer?");
            System.out.println("1. Ingresar un vehiculo\n2. Mostrar vehiculos\n3. Salir");
            op = sc.nextInt();
            switch(op){
                case 1:
                    Vehiculos v1 = new Vehiculos();
                    v1.IngresoVehiculo();
                    lista.add(new Vehiculos(v1.getPlaca(), v1.getMarca(), v1.getCarroceria(), v1.getColor(), v1.getModelo()));
                    break;
                case 2:
                    for(Vehiculos vehiculo : lista){
                        System.out.println(vehiculo);
                    }
                    break;
                case 3:
                    val = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta.");
            }
        }
    }
}