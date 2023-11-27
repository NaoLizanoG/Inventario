import java.util.Scanner;

public class Tecnologia extends Producto {
    int vidaUtlAnios;
    String garantia;
    int anioFabricacion;
    String modelo;
    @Override
    public void bienvenida(){
        System.out.println("Ingrese un producto de tecnologìa");
    }
    public void antiguedad(){
        int aniosantiguedad= 2023-anioFabricacion;
    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el código del producto: ");
        this.Codigo = sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad = sc.nextInt();
        System.out.println("Ingrese la marca del producto: ");
        this.Marca = sc.next();
        System.out.println("Ingrese la vida util:");
        this.vidaUtlAnios= sc.nextInt();
        System.out.println("Ingrese el año de fabricaciòn");
        this.anioFabricacion= sc.nextInt();
        System.out.println("Ingrese la garantia:");
        this.garantia= sc.next();
        System.out.println("Ingrese el modelo:");
        this.modelo= sc.next();
    }

    @Override
    public String toString(){
        return "Existen "+cantidad+ " productos del electrodomestico " +this.nombre+ " de marca "+this.Marca;
    }



}
