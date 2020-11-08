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
    private String idResep;
    private String[] daftarObat;
    private String status;
    
    public Resep(String id, String[] daftar, String stat){
        idResep = id;
        daftarObat = daftar;
        status = stat;
    }
}
