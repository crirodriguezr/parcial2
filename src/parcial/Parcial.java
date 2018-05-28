
package parcial;

import java.util.Scanner;


public class Parcial {

    public static void main(String[] args) {
   
       Calculador micalculador =new Calculador();
       
       Scanner miscanner = new Scanner(System.in);
       
       System.out.println("del punto 1 la cordenada x;");
       int x=miscanner.nextInt();
       micalculador.punto1.setX(x);
        
         System.out.println("del punto 1 la cordenada y;");
       int y=miscanner.nextInt();
       micalculador.punto1.setY(y);
       
         System.out.println("del punto 2 la cordenada x;");
       int x1=miscanner.nextInt();
       micalculador.punto2.setX(x1);
      
         System.out.println("del punto 2 la cordenada y;");
       int y1=miscanner.nextInt();
       micalculador.punto2.setY(y1);
        
        System.out.println(micalculador.calculardistancia());
         System.out.print(micalculador.calculararea()+ " ");
          System.out.println("centimetros cuadrados");
          System.out.println(micalculador.calcularpendiente());
        
        
        
    }
    
}
