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
public abstract class Dekorator extends ZamowienieInterfejs{
    protected ZamowienieInterfejs zamowienie;
    
    public Dekorator(ZamowienieInterfejs zamowienie){
        this.zamowienie = zamowienie;
    }
    
    
}
