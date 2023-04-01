package cocina2;

import Entidades.Receta1;

public class Cocina2 {

    public static void main(String[] args) {
        //-----Inventario inicial
        int harinaI = 500;
        int salI = 200;
        int mantecaI = 600;
        int azucarI = 800;
        System.out.println("Inventario inicial");
        System.out.println("azucar "+azucarI);
        System.out.println("harina "+harinaI);
        System.out.println("manteca "+mantecaI);
        System.out.println("sal "+salI);

        //-----------------
        Receta1 cocina = new Receta1();
        System.out.println();
        cocina.Muestra();
        System.out.println();
        //---------
        System.out.println("inventario final");
        azucarI -= cocina.azucar;
        harinaI -= cocina.harina;
        mantecaI -= cocina.manteca;
        salI -= cocina.sal;
//--------------------
        System.out.println("Inventario inicial");
        System.out.println("azucar "+azucarI);
        System.out.println("harina "+harinaI);
        System.out.println("manteca "+mantecaI);
        System.out.println("sal "+salI);

    }

}
