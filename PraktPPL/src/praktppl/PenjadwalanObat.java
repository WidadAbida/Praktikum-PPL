package praktppl;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Aryasakti Wirasena
 */
public class PenjadwalanObat {
    // Note : tanggal bisa pake java.time.LocalDate kl mau
    int tanggalAwal;
    int bulanAwal;
    ArrayList<String> namaObat;
    ArrayList<Integer> frekuensi;
    ArrayList<Integer> quantity;
    
    public PenjadwalanObat(int tanggal, int bulan, String[] obat, Integer[] freq, Integer[] quant){
        tanggalAwal = tanggal;
        bulanAwal = bulan;
        namaObat = new ArrayList<>(Arrays.asList(obat));
        frekuensi = new ArrayList<>(Arrays.asList(freq));
        quantity = new ArrayList<>(Arrays.asList(quant));
    }
    
    public void update(Resep resep){
        assert(resep.status.equals("ACC"));
        for(int i=0;i<resep.jumlahObat;i++){
            if(namaObat.contains(resep.namaObat[i])){
                quantity.set(i, quantity.get(namaObat.indexOf(resep.namaObat[i])) + resep.quantityObat[i]);
            }
            else{
                namaObat.add(resep.namaObat[i]);
                quantity.add(resep.quantityObat[i]);
            }
        }
    }
}