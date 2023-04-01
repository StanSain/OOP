/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego,
crea métodos para agregar nuevas recetas a la lista, para buscar una
receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */
package cocina;

import Entidades.Receta;
import java.util.Scanner;
import Entidades.receta1;
public class Cocina {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
receta1 coci = new receta1();
System.out.println(coci.nombre);


//inventario inicial
        int harinaI = 15200;//en gramos
        double aguaI = 200;//en litros
        int azucarI = 2500;//en gramos
        int levaduraI = 150;//en gramos
        int maizenaI = 3200;//en gramos
        int salI = 1000;//en gramos
        int mantecaI = 2000;//en gramos
//
        System.out.println("harina " + harinaI + " azucar " + azucarI);
        System.out.println(" levadura " + levaduraI + " maizena " + maizenaI);
        System.out.println("sal " + salI + " manteca" + mantecaI);
        System.out.println("agua " + aguaI);

        //----escribo r1 primera receta 
        Receta r1 = new Receta();
        r1.EscribeR();

// ---------- receta1
        System.out.println(r1.nombre);
        String nombrer1 = r1.nombre;
        int harinar1 = r1.harina;
        int azucarr1 = r1.azucar;
        int levadurar1 = r1.levadura;
        int maizenar1 = r1.maizena;
        int salr1 = r1.sal;
        int mantecar1 = r1.manteca;
        double aguar1 = r1.agua;

        System.out.println("harina " + r1.harina + " azucar " + r1.azucar + " levadura " + r1.levadura);
        System.out.println(" maizena " + r1.maizena + "sal " + r1.sal + " manteca" + r1.manteca);
        System.out.println(" agua " + r1.agua);
// fin primera receta 
//--pregunta si cocina 
        int cocinoE;
        System.out.println("¿cocino la receta? si: 1, no :0 ");

        cocinoE = leer.nextInt();

        if (cocinoE== 1) {
            harinaI -= r1.harina;
            aguaI -= r1.agua;
            azucarI -= r1.azucar;
            levaduraI -= r1.levadura;
            maizenaI -= r1.maizena;
            salI -= r1.sal;
            mantecaI -= r1.manteca;

            System.out.println("harina " + harinaI + " azucar " + azucarI);
            System.out.println(" levadura " + levaduraI + " maizena " + maizenaI);
            System.out.println("sal " + salI + " manteca" + mantecaI);
            System.out.println("agua " + aguaI);
        }
        //--------------------------------------------------------

        Receta r2 = new Receta();
        r2.EscribeR();

        // ---------- receta2
        System.out.println(r2.nombre);
        String nombrer2 = r2.nombre;
        int harinar2 = r2.harina;
        int azucarr2 = r2.azucar;
        int levadurar2 = r2.levadura;
        int maizenar2 = r2.maizena;
        int salr2 = r2.sal;
        int mantecar2 = r2.manteca;
        double aguar2 = r2.agua;

        System.out.println("harina " + r2.harina + " azucar " + r2.azucar + " levadura " + r2.levadura);
        System.out.println(" maizena " + r2.maizena + "sal " + r2.sal + " manteca" + r2.manteca);
        System.out.println(" agua " + r2.agua);

        //---------------------------
//--pregunta si cocina 
  
        System.out.println("¿cocino la receta? si: 1, no :0 ");

        cocinoE = leer.nextInt();

        if (cocinoE== 1) {
            harinaI -= r2.harina;
            aguaI -= r2.agua;
            azucarI -= r2.azucar;
            levaduraI -= r2.levadura;
            maizenaI -= r2.maizena;
            salI -= r2.sal;
            mantecaI -= r2.manteca;

            System.out.println("harina " + harinaI + " azucar " + azucarI);
            System.out.println(" levadura " + levaduraI + " maizena " + maizenaI);
            System.out.println("sal " + salI + " manteca" + mantecaI);
            System.out.println("agua " + aguaI);

        //-------------------------   


    }

}
    
    
}
