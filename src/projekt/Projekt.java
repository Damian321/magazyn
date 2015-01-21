/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

/**
 *
 * @author Kostek
 */
public class Projekt {

   
    
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConn dbConn = DatabaseConn.GetInstance();
        dbConn.createConnection();
   
        ZamowienieInterfejs zam = new ZamowienieFaktura(new ZamowienieRabat(new Zamowienie()));
        
        zam.RealizacjaZamowienia(0, false);
    
     
       
        JFrameGlowna glownaFrame = new JFrameGlowna();
        glownaFrame.setVisible(true);
    }
    
}
