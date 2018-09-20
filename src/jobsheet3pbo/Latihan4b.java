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
public class Latihan4b extends Latihan4a{
    private int b;
    public void setLatihan4b(int nilai){
        b = nilai;
    }
    public int getLatihan4b(){
        return b;
    }
    
    //melakukan override terhadap method tampilkanNilai()
    //yang terdapat pada kelas A
    
    public void tampilkanNilai(){
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("Nilai b : " +getLatihan4b());
    }
}
