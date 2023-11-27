import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento extends Producto{
    private String fechaElaboracion;
    private String fechaVencimiento;
    private List<String> ingredientes = new ArrayList<>();

    public Alimento() {
        /*super(nombre, precio, Codigo, cantidad);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
        this.ingredientes = ingredientes;*/
    }



    @Override
    public void bienvenida(){
        System.out.println("Ingrese el producto de tipo alimento");
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
        System.out.println("Ingrese la fecha de elaboración del producto: ");
        this.fechaElaboracion = sc.next();
        System.out.println("Ingrese la fecha de vencimiento del producto: ");
        this.fechaVencimiento = sc.next();
        System.out.println("Ingrese los ingredientes del producto: ");
        String ingrediente = sc.next();
        this.ingredientes.add(ingrediente);
        System.out.println("Ingrese la marca del producto: ");
        this.Marca = sc.next();
    }


    @Override
    public String toString(){
        return "Existen "+cantidad+ " productos del electrodomestico " +this.nombre+ " de marca "+this.Marca;
    }
}
