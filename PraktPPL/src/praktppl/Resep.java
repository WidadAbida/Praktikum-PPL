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
    private String resepID;
    private int jumlahObat;
    private String[] namaObat;
    private int penggunaanObat;
    private String status;
    
    public Resep(String id, int jumlah, String[] nama, int penggunaan, String stat){
        resepID = id;
        jumlahObat = jumlah;
        namaObat = nama;
        penggunaanObat = penggunaan;
        status = stat;
    }
}
