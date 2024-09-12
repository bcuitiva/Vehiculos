import java.util.Scanner;

public class Vehiculos {
    Scanner sc = new Scanner(System.in);
    private String placa, marca, carroceria, color;
    private int modelo;

    public Vehiculos() {
    }
    public Vehiculos(String placa, String marca, String carroceria, String color, int modelo) {
        this.placa = placa;
        this.marca = marca;
        this.carroceria = carroceria;
        this.color = color;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\n Vehiculo: " +
                "\n\t- Placa = " + placa +
                "\n\t- marca = " + marca +
                "\n\t- modelo = " + modelo +
                "\n\t- carroceria = " + carroceria +
                "\n\t- color = " + color;
    }

    public void IngresoVehiculo(){
        System.out.println("Ingrese la placa del vehiculo:");
        this.placa = sc.next();
        System.out.println("Ingrese la marca del vehiculo:");
        this.marca = sc.next();
        sc.nextLine();
        System.out.println("Ingrese la carroceria del vehiculo:");
        this.carroceria = sc.next();
        System.out.println("Ingrese el color del vehiculo:");
        this.color = sc.next();
        System.out.println("Ingrese el modelo del vehiculo:");
        this.modelo = sc.nextInt();
    }
}
