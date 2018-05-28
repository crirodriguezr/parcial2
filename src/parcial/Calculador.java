/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiantes
 */
public class Calculador implements Icalculador{
    
    
    public Punto punto1=new Punto();
       public Punto punto2=new Punto();
    
     public double calculardistancia(){
         punto1.getX();
         punto1.getY();
         punto2.getX();
         punto2.getY();
         
        double Distanciax = punto2.getX()- punto1.getX();
        double Distanciay = punto2.getY()- punto1.getY();
         double cuadradox=Math.pow(Distanciax,2);
               double  cuadradoy=Math.pow(Distanciay,2);
        double  sumaxy=cuadradox+cuadradoy;
        double distanciaT=Math.sqrt(sumaxy);
         return distanciaT ;
     }
     public double calculararea(){
          double Distanciay = punto2.getY()- punto1.getY();
         double Distanciax = punto2.getX()- punto1.getX();
         double arearectangulo= Distanciax*punto1.getY();
         double areatriangulo= (Distanciax*Distanciay)/2;
         
         
         
         return (arearectangulo+areatriangulo) ;
     }
      public double calcularpendiente(){
           double Distanciax = punto2.getX()- punto1.getX();
        double Distanciay = punto2.getY()- punto1.getY();
          double Pendiente = Distanciay/Distanciax;
          return Pendiente;
      }
    
}
