/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.dekorator;

import projekt.DatabaseConn;
import projekt.Towar;

/**
 *
 * @author Kostek
 */
public class Zamowienie extends ZamowienieInterfejs{ 
    @Override
    public void RealizacjaZamowienia(){
        DatabaseConn dbconn = DatabaseConn.GetInstance();
        
        dbconn.dodajZamowienie(this);
        
        for(Towar towar:this.getLista_towarow())
            dbconn.zmienIlosc(towar.getNazwa(), towar.getIlosc());
        
        System.out.println("zwykle zamowienie");
    }
}
