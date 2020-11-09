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
