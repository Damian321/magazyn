/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.dekorator;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kostek
 */
public class Zamowienie extends ZamowienieInterfejs{ 
    @Override
    public void RealizacjaZamowienia(double rabat, Boolean czyFaktura){
        System.out.println("zwykle zamowienie");
         System.out.println("RAbaT: " + rabat);
         System.out.println("Faktura: " + czyFaktura);
    }
}
