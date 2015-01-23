/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.dekorator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import projekt.Towar;

/**
 *
 * @author Kostek
 */
public class Faktura extends Dekorator {

    public Faktura(ZamowienieInterfejs zamowienie) {
        super(zamowienie);
    }

    @Override
    public void RealizacjaZamowienia() {
        PrintWriter zapis = null;
        System.out.println("DRUKOWANIE FAKTURY");
        System.out.println("------------------");
        zamowienie.setRabat(this.getRabat());      
        
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = new Date();
        
        try {           
            zapis = new PrintWriter("faktura.html");
            zapis.print("<!DOCTYPE html><html><head>"+
                    "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />"+
                    "<style type=\"text/css\">"+
                    "#dziecko {float:left;width:50%;}</style></head>"+
                    "<body><h1><center>Faktura VAT</center></h1><hr>"+
                    "<p><b>Data sprzedazy:</b> "+dateFormat.format(date)+" <br>"+
                    "<b>Data wystawienia:</b> "+dateFormat.format(date)+"</p>"+
                    "<div id=\"rodzic\"><div id=\"dziecko\"><p><h2>Sprzedawca:</h2>"+
                    "Nazwa firmy <br>ul. Wiejska 54 <br>15-001 Bialystok <br>"+
                    "NIP: 242342543656291 <br></p></div><div id=\"dziecko\"><h2>Nabywca:</h2>"+
                    "<p>"+zamowienie.getImie()+" "+zamowienie.getNazwisko()+"<br><br><br><br></p>"+
                    "</div></div><hr><h2><center> Lista produktów:</center></h2>"+
                    "<center><table border=\"1\"><tr bgcolor=\"lightgrey\">"+
                    "<td>Nazwa produktu</td><td>Ilosc</td><td>Stawka VAT</td><td>cena</td>");
                    
            for(Towar towar:zamowienie.getLista_towarow()){
                zapis.print("<tr>");
                zapis.print("<td>"+towar.getNazwa()+"</td><td>"+towar.getIlosc()+
                        "</td><td>"+towar.getStawkaVAT()+"</td><td>"+towar.getCena());
                zapis.print("</tr>");
            }
                    
            zapis.print("</table></center></body></html>");
            
            
            zapis.close();
        } catch (FileNotFoundException ex){ 
            Logger.getLogger(Faktura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        zamowienie.RealizacjaZamowienia();
    }

}
