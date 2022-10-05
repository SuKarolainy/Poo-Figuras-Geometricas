/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suellen.karolainy.figurasgeometricas;

/**
 *
 * @author IFNMG
 */
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo() {
        //System.out.println("Construtor padrão de Triangulo invocado");
    }

    public Triangulo(int lados) {
        //System.out.println("Construtor sobrecarregado de Triangulo invocado");
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
    
    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}
