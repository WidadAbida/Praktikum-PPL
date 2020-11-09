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
public class PermintaanResep {
    String orderID;
    Dokter dokter;
    Pasien pasien;
    String status;
    
    // Constructor
    public PermintaanResep(String id, Dokter dok, Pasien pas, String stat){
        orderID = id;
        dokter = dok;
        pasien = pas;
        status  = stat;
    }
}
