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
public class B extends A {
    private int b1;
    
    public B(int a,int b){
        super(a);
        this.b1 =b;
    }
    public void yy(){
        System.out.println("En B");
    }
    @Override
    public void xx(){
        System.out.println("Reescrito");
    }
}
