<<<<<<< HEAD
package praktppl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aryasakti Wirasena
 */
public class Pasien extends User{
    String namaPasien;
    String NIK;
    String noTelp;
    Dokter dokter;
    ArrayList<Resep> daftarResep;
    PenjadwalanObat jadwal;
    
    public Pasien(String id, String pw) {
        super(id, pw);
    }
    
    public void daftar(String nama, String noNIK, String telp, Dokter dok) {
        namaPasien = nama;
        NIK = noNIK;
        noTelp = telp;
        dokter = dok;
        daftarResep = new ArrayList<>();
    }
    
    public void melakukanPermintaan(Scanner sc){
        System.out.print("Id = ");
        String id = sc.next();
        
        String stat = "PENDING";
        PermintaanResep req = new PermintaanResep(id, dokter, this, stat);
        Resep resep = dokter.beriResep(req, sc);
        daftarResep.add(resep);
    }
    
    public void tebusResep(Resep resep){ 
        if(jadwal == null){
            String[] namaObat = resep.namaObat;
            Integer[] freq = resep.penggunaanObat;
            Integer[] quant = resep.quantityObat;
            jadwal = new PenjadwalanObat(resep.tanggal, resep.bulan, namaObat, freq, quant);
        }
            
        jadwal.update(resep);
        daftarResep.remove(0);
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktppl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aryasakti Wirasena
 */
public class Pasien extends User{
    String namaPasien;
    String NIK;
    String noTelp;
    Dokter dokter;
    ArrayList<Resep> daftarResep;
    PenjadwalanObat jadwal;
    
    public Pasien(String id, String pw) {
        super(id, pw);
    }
    
    public void daftar(String nama, String noNIK, String telp, Dokter dok) {
        namaPasien = nama;
        NIK = noNIK;
        noTelp = telp;
        dokter = dok;
        daftarResep = new ArrayList<Resep>();
    }
    
    public void melakukanPermintaan(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Id = ");
        String id = sc.nextLine();
        
        String stat = "PENDING";
        PermintaanResep req = new PermintaanResep(id, dokter, this, stat);
        Resep resep = dokter.beriResep(req);
        daftarResep.add(resep);
    }
    
    public void tebusResep(Resep resep){  
        jadwal.update(resep);
        daftarResep.remove(0);
    }
}
>>>>>>> d8ce4ca43ae715697b6b9653470ba9e392558998
