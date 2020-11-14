<<<<<<< HEAD
package praktppl;

/**
 *
 * @author Aryasakti Wirasena
 */
public class Resep {
    String resepID;
    int tanggal;
    int bulan;
    int jumlahObat;
    String[] namaObat;
    Integer[] penggunaanObat;
    Integer[] quantityObat;
    String status;
    
    public Resep(String id, int tanggal, int bulan, int jumlah, 
            String[] nama, Integer[] penggunaan, Integer[] quantity, String stat){
        resepID = id;
        this.tanggal = tanggal;
        this.bulan = bulan;
        jumlahObat = jumlah;
        namaObat = nama;
        penggunaanObat = penggunaan;
        quantityObat = quantity;
        status = stat;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktppl;

/**
 *
 * @author Aryasakti Wirasena
 */
public class Resep {
    String resepID;
    int jumlahObat;
    String[] namaObat;
    int[] penggunaanObat;
    int[] quantityObat;
    String status;
    
    public Resep(String id, int jumlah, String[] nama, int[] penggunaan, int[] quantity, String stat){
        resepID = id;
        jumlahObat = jumlah;
        namaObat = nama;
        penggunaanObat = penggunaan;
        quantityObat = quantity;
        status = stat;
    }
}
>>>>>>> d8ce4ca43ae715697b6b9653470ba9e392558998
