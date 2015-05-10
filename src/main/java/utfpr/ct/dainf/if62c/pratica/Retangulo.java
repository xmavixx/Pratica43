package utfpr.ct.dainf.if62c.pratica;



/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Retangulo implements FiguraComLados{
   
    public double a;
    public double b;

    public Retangulo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getLadoMenor() {

        return a;
    }

    @Override
    public double getLadoMaior() {

        return b;

    }
    public double getArea(){
        double area;
        area = getLadoMenor()*getLadoMaior();
        return area;
    }
    public double getPerimetro(){
        double Perimetro;
        Perimetro = 2*getLadoMaior() +2*getLadoMenor();
        return (Perimetro);
    }

}
