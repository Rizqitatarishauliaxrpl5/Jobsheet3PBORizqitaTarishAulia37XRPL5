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
class TugasPraktikumA {
    private String namaGuru;
    private String mapel;
    
    
    public TugasPraktikumA(String namaGuru,String mapel){
        this.namaGuru = namaGuru;
        this.mapel = mapel;
    }
    public void data(){
        System.out.println("Nama Guru : "+this.namaGuru);
        System.out.println("Pengajar Mapel : "+this.mapel);
    }
}
public class TugasPraktikum extends TugasPraktikumA{
    private String walas;
    
    public TugasPraktikum(String walas,String namaGuru,String mapel){
        super(namaGuru,mapel);
        this.walas = walas;
    }
    public void data(){
        System.out.println("Wali Kelas : "+this.walas);
        super.data();
        
    }

    public static void main(String[] args){
        TugasPraktikum TP = new TugasPraktikum("XRPL5","Ardhian Suseno","B.Inggris");
        TP.data();
    }
}


