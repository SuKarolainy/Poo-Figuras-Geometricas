/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package suellen.karolainy.figurasgeometricas;

/**
 *
 * @author IFNMG
 */
public class FigurasGeometricas {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.setLados(3);
        t1.setBase(3.0);
        t1.setAltura(4.0);
        
        System.out.println("> " + t1.getLados());
        System.out.println("> " + t1.getBase());
        System.out.println("> " + t1.getAltura());
        System.out.println("Area: " + t1.calcularArea());
        System.out.println("---------------------------------");
        Triangulo t2 = new Triangulo();
        t2.setLados(3);
        t2.setBase(4.0);
        t2.setAltura(4.0);
        
        System.out.println("> " + t2.getLados());
        System.out.println("> " + t2.getBase());
        System.out.println("> " + t2.getAltura());
        System.out.println("Area: " + t2.calcularArea());
        System.out.println("---------------------------------");
        
        FiguraGeometrica f1 = new Triangulo();
        ((Triangulo) f1).setLados(3);
        ((Triangulo) f1).setBase(3.0);
        ((Triangulo) f1).setAltura(4.0);
        
        System.out.println("> " + f1.getLados());
        //System.out.println("> " + f1.getBase());
        //System.out.println("> " + f1.getAltura());
        System.out.println("Area: " + f1.calcularArea());
        System.out.println("---------------------------------");
        
        Quadrado q1 = new Quadrado();
        q1.setLado(4.0);
        System.out.println("> " + q1.getLado());
        System.out.println("Area: "  + q1.calcularArea());
        System.out.println("---------------------------------");
    }
}
