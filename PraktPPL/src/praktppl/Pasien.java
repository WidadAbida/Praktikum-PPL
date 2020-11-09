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
public class Pasien extends User{
    private String namaPasien;
    private String NIK;
    private String noTelp;
    
    public Pasien(String id, String pw) {
        super(id, pw);
    }
    
    public void penjadwalanObat();
    
    public void melakukanPermintaan();
   
}
