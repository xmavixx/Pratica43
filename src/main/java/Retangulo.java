

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
        base = altura = 0;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    public double getArea() {
        return base * altura;
    }
    
    public double getPerimetro() {
        return (base + altura) * 2;
    }
    
    public double getLadoMaior(){  
        return base;
    }
    
    public double getLadoMenor(){  
        return altura;
    }    
}
