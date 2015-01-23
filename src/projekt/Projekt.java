/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import projekt.dekorator.ZamowienieRabat;
import projekt.dekorator.ZamowienieFaktura;
import projekt.dekorator.Zamowienie;
import projekt.dekorator.ZamowienieInterfejs;

/**
 *
 * @author Kostek
 */
public class Projekt {

   
    
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConn dbConn = DatabaseConn.GetInstance();
        dbConn.createConnection();
   
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setImie("Alfred");
        System.out.println("Zamowienie składa: "+ zamowienie.getImie());
        ZamowienieInterfejs zam = new ZamowienieFaktura(new ZamowienieRabat(zamowienie));
        
        
        zam.RealizacjaZamowienia();
    
     
       
        JFrameGlowna glownaFrame = new JFrameGlowna();
        glownaFrame.setVisible(true);
    }
    
}
