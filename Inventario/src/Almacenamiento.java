import java.util.ArrayList;
import java.util.List;

public class Almacenamiento {
    List<Alimento> pAlimentos = new ArrayList<>();
    List<Electrodomestico> pElectrodomestico = new ArrayList<>();
    List<Tecnologia> pTecnologia = new ArrayList<>();
 public void guardarAlimentos(Alimento a1){
     pAlimentos.add(a1);
 }

 public void guardarElectrodomestico(Electrodomestico e1){
        pElectrodomestico.add(e1);
 }
 public void  guardarTecnologia(Tecnologia t1){
     pTecnologia.add(t1);
 }

 public void MostrarA(int i){
        System.out.println(pAlimentos.get(i));

    }public void MostrarE(int i){

        System.out.println(pTecnologia.get(i));
    }
    public void MostraT(int i){

        System.out.println(pTecnologia.get(i));
    }


}
