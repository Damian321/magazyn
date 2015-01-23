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
        System.out.println("DRUKOWANIE FAKTURY");
        System.out.println("------------------");
        zamowienie.setRabat(this.getRabat());
        zamowienie.RealizacjaZamowienia();
    }

}
