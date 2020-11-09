/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktppl;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class PraktPPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Dokter dokter = new Dokter("Dok01", "4321");
        dokter.daftar("Tirta", "001", "082329172372");
        
        Pasien pasien = new Pasien("Pas01", "1234");
        pasien.daftar("Fulan", "34040987665", "08123456789", dokter);
        
        System.out.println("Demo Interaksi Antar Class");
        int command = -1;
        while(command != 0){
            System.out.println("1. Tampilkan jadwal obat pasien");
            System.out.println("2. Minta resep ke dokter");
            System.out.println("3. Tebus resep paling lama");
            System.out.println("4. Konfirmasi konsumsi obat");
            System.out.println("5. Exit");
            System.out.println("> ");
            command = sc.nextInt();
            
            switch(command){
                case 1:
                    for(int i = 0 ;i < pasien.jadwal.namaObat.size();i++){
                        System.out.println( pasien.jadwal.namaObat.get(i) + 
                                            pasien.jadwal.frekuensi.get(i) +
                                            pasien.jadwal.quantity.get(i));
                    }
                    break;
                
                case 2:
                    pasien.melakukanPermintaan();
                    break;
                
                case 3:
                    if(pasien.daftarResep.isEmpty()){
                        System.out.print("Belum ada resep! minta resep terlebih dahulu");
                    }
                    else{
                        pasien.tebusResep(pasien.daftarResep.get(0));
                    }
                    
                case 4:
                    String obat;
                    System.out.print("Masukkan nama obat yang dikonsumsi : ");
                    obat = sc.nextLine();
                    if(pasien.jadwal.namaObat.contains(obat)){
                        
                    }
                    else{
                        System.out.println("Nama obat tidak ditemukan!");
                    }
            }
        }
    }
}
