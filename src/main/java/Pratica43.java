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
    public static void main(String[] args) {
        Retangulo r = new Retangulo(4, 2);
        Quadrado q = new Quadrado(4);
        TrianguloEquilatero te = new TrianguloEquilatero(4);

        System.out.println("Area do retângulo = " + r.getArea());
        System.out.println("Perímetro do retângulo = " + r.getPerimetro());
        System.out.println("Area do quadrado = " + q.getArea());
        System.out.println("Perímetro do quadrado = " + q.getPerimetro());
        System.out.println("Area do triângulo = " + te.getArea());
        System.out.println("Perímetro do triângulo = " + te.getPerimetro());
    }    
}
