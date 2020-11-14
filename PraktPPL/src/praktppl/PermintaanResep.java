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
