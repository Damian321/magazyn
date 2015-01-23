/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import projekt.dekorator.Rabat;
import projekt.dekorator.Faktura;
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
         
        JFrameGlowna glownaFrame = new JFrameGlowna();
        glownaFrame.setVisible(true);
    }
    
}
