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
public class Zamowienie extends ZamowienieInterfejs{ 
    @Override
    public void RealizacjaZamowienia(){
        System.out.println("zwykle zamowienie");
        System.out.println(this.getImie());
        System.out.println(this.getRabat());
    }
}
