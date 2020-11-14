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
