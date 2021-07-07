/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8abstract;

/**
 *
 * @author gerar
 */
public class p8abstract {
    public static void main(String[] args ){
        //Poligono poligono = new Poligono(); X no se puede
        Poligono poligono;
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        poligono = new Triangulo();
        System.out.println(poligono);
    }
}
