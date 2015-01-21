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
public class ZamowienieRabat extends Dekorator{

    public ZamowienieRabat(ZamowienieInterfejs zamowienie) {
       
        super(zamowienie);
    }
    
    @Override
    public void RealizacjaZamowienia(double rabat, Boolean czyFaktura){
        System.out.println("rabat");
        zamowienie.RealizacjaZamowienia(30.0, czyFaktura);
    }
    public void ustawRabat(double rabat){
        zamowienie.setRabat(rabat);
        System.out.println(zamowienie.getRabat());
        System.out.println("rabat ustawiony");
    }


}
