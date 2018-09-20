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
public class Latihan5b extends Latihan5a {
    //the mountaintruck subclass adds one field
    public int seatHeight;
    //the mountaintruck subclass has one contructor
    public Latihan5b(int startHeight, int startCadence, int startSpeed, int startGear){
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
}
   //the mountaintruck subclass adds one method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[]aku){
        System.out.println("Mulai Berjalan");
        Latihan5b MB = new Latihan5b(0,0,0,0);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
    }
}
