

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class TrianguloEquilatero implements FiguraComLados {
    double a;
    double h;
    
    public TrianguloEquilatero(double a){
    
    this.a = a;
    this.h = (a*Math.sqrt(2))/2;
    
}
    @Override
    public double getLadoMenor(){
        return a;
    }
    @Override
    public double getLadoMaior(){
        return h;
    } 
    public double getArea(){
        double Area;
        Area = (getLadoMenor()*getLadoMaior())/2;
         return(Area);       
    }
    public double getPerimetro(){
        double Perimetro;
        Perimetro = 3*getLadoMenor();
        return (Perimetro);
    }
}
