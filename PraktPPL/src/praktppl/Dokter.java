package praktppl;

import java.util.Scanner;

/**
 *
 * @author Aryasakti Wirasena
 */
public class Dokter extends User{
    String namaDokter;
    String noSIP;
    String noTelp;
    
    public Dokter(String id, String pw) {
        super(id, pw);
    }
    
    public Resep beriResep(PermintaanResep req, Scanner sc){
        assert(req.dokter.namaDokter.equals(namaDokter));
        
        System.out.print("Id Resep = ");
        String id = sc.nextLine();
        
        System.out.print("Jumlah obat = ");
        int jumlah = Integer.parseInt(sc.nextLine());
        
        System.out.print("Tanggal dan bulan = ");
        String[] temp = sc.nextLine().split(" ");
        int tanggal = Integer.parseInt(temp[0]);
        int bulan = Integer.parseInt(temp[0]);
        
        
        String nama[] = new String[jumlah];
        Integer penggunaan[] = new Integer[jumlah];
        Integer quantity[] = new Integer[jumlah];
        
        System.out.println("Input nama obat, jumlah, dan frekuensi penggunaan : ");
        for(int i = 0; i < jumlah;i++){
            String inp = sc.nextLine();
            String[] inparr = inp.split(" ");
            nama[i] = inparr[0];
            quantity[i] = Integer.parseInt(inparr[1]); 
            penggunaan[i] = Integer.parseInt(inparr[2]); 
        }
        
        String stat = "ACC";
        Resep resep = new Resep(id, tanggal, bulan, jumlah, nama, penggunaan, quantity, stat);
        return resep;
    }
    
    public void daftar(String nama, String SIP, String telp) {
        namaDokter = nama;
        noSIP = SIP;
        noTelp = telp;
    }
}
