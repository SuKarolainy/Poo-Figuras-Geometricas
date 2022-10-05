/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suellen.karolainy.figurasgeometricas;

/**
 *
 * @author IFNMG
 */
public class Quadrado extends FiguraGeometrica{
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
