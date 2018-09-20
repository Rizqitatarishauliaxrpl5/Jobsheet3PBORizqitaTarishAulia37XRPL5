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
public class Latihan2a {
    private String nama;
    private int usia;
    
    //konstruktor
    public Latihan2a (String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }
    //metode
    public void info(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Usia : "+this.usia);
    }
}
