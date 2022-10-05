/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suellen.karolainy.figurasgeometricas;

/**
 *
 * @author IFNMG
 */
public abstract class FiguraGeometrica {
    private int lados;

    public FiguraGeometrica() {
        lados = -1;
    }
    
    public FiguraGeometrica(int lados) {
        this.lados = lados;
    }

    public abstract double calcularArea();

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
}
