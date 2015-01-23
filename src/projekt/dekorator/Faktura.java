/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.dekorator;

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
        System.out.println("faktura");
        System.out.println("Imie: " + zamowienie.getImie());
        zamowienie.setRabat(this.getRabat());
        System.out.println("Rabat: " + this.getRabat());
        zamowienie.RealizacjaZamowienia();
    }

}
