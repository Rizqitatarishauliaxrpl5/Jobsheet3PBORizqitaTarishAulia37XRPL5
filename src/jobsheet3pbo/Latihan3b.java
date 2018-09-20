/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet3pbo;

/**
 *
 * @author Tarishaulia
 */
public class Latihan3b extends Latihan3a{
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod(){
        System.out.println("The instance method in Gajah...");
    }
    public static void main(String[] args){
        Latihan3a myGajah = new Latihan3a();
        Latihan3b myHewan = new Latihan3b();
        Latihan3b.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
