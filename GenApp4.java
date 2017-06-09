/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author redo-hunter
 */
public class GenApp4 {
    String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
     this.nama= nama;   
    
    }
 
    private static <T> void genapp4 (T bebas) {
        System.out.println(bebas);
    }    
    public static void main (String[] Args){
        GenApp4 app = new GenApp4();
        
        app.setNama("Hamjah");
        System.out.println(app.getNama());
        genapp4("Tekhnik Informatika");
        
    }
    
}

