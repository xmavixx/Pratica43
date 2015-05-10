
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;
import utfpr.ct.dainf.if62c.pratica.Quadrado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class Pratica43 {
     
      
     
      private static final Circulo c = new Circulo(2);
      private static final Elipse e = new Elipse(2,3);
      private static final TrianguloEquilatero t = new TrianguloEquilatero(2);
      private static final Retangulo r = new Retangulo(2,3);
      private static final Quadrado q = new Quadrado(2);
      
      
      
      
      public static void main(String[] args){
          System.out.println("Area da Elipse: " + e.getArea());
          System.out.println("Perimetro da Elipse: " + e.getPerimetro());
          System.out.println("Area do Circulo: "+ c.getArea());
          System.out.println("Perimetro do Cirulo: " + c.getPerimetro());
          
          System.out.println("Area do Triangulo: "+ t.getArea());
          System.out.println("Perimetro do Triangulo: " + t.getPerimetro());
          
          System.out.println("Area do Quadrado: "+ q.getArea());
          System.out.println("Perimetro do Quadrado: " + q.getPerimetro());
          
          System.out.println("Area do Retangulo: "+ r.getArea());
          System.out.println("Perimetro do Retangulo: " + r.getPerimetro());
      }  
}
