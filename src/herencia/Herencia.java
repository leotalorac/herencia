/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A(5);
        System.out.println(a.getA1());
        a.xx();
        
        
       B b = new B(1,25);
       b.xx();
        System.out.println(ejemplo.getA1());
    }
    
}
