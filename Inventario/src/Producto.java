import java.util.Scanner;

public class Producto {
String nombre;
double precio;
String Codigo;
int cantidad;
String Marca;
    public Producto(String nombre, double precio, String Codigo, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.Codigo=Codigo;
        this.cantidad=cantidad;
    }

    public Producto (){

    }
    public void ingresarProducto(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el código del producto: ");
        this.Codigo=sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad=sc.nextInt();
    }

    public void  bienvenida(){
        System.out.println("Bienvneido a tu sistema de inventario");
    }

    public String getMarca() {

        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void todo(){
        int i=-1;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Elija una opción");
            System.out.println("1.Producto tipo alimento");
            System.out.println("2.Producto tipo electrodomestico");
            System.out.println("3.Producto tipo tecnología");
            System.out.println("4.Ver productos ingresados");
            System.out.println("5. Salir");
            i=i+1;
            int a = sc.nextInt();
            Almacenamiento al1= new Almacenamiento();
            switch (a){

                case 1:
                    Alimento a1=new Alimento();
                    a1.bienvenida();
                    a1.ingresarProducto();
                    al1.guardarAlimentos(a1);
                    break;


                case 2:
                    Electrodomestico e1=new Electrodomestico();
                    e1.bienvenida();
                    e1.ingresarProducto();
                    al1.guardarElectrodomestico(e1);
                    break;

                case  3:
                    Tecnologia t1=new Tecnologia();
                    t1.bienvenida();
                    t1.ingresarProducto();
                    al1.guardarTecnologia(t1);
                    break;

                    case 4:
                        System.out.println("Elija que producto quiere ver");
                        System.out.println("1.Alimentos");
                        System.out.println("2.Electrodomésticos");
                        System.out.println("3.Tecnología");
                        int b = sc.nextInt();
                        switch (b){
                            case 1:
                                System.out.println("Ingrese el numero de producto que quiere ver");
                                int c = sc.nextInt();
                                al1.MostrarA(c);
                                break;
                            case 2:

                                System.out.println("Ingrese el numero de producto que quiere ver");
                                int d = sc.nextInt();
                                al1.MostrarE(d);
                                break;
                            case 3:

                                System.out.println("Ingrese el numero de producto que quiere ver");
                                int e = sc.nextInt();
                                al1.MostraT(e);
                                break;
                        }
                            case 5:
                                i=-1;
                                break;

                            default:
                                throw new IllegalStateException("Unexpected value: " + a);
                             }



        }while (i>-1);

    }

}
//hola
//jnd

