/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt.iterator;

import java.util.List;
import projekt.Towar;

/**
 *
 * @author Damian
 */
public class KolekcjaTowaru implements Kolekcja{
    public List<Towar> lista_towarow;
    
    public KolekcjaTowaru(List<Towar> lista_towarow){
        this.lista_towarow = lista_towarow;
    }
    
    public Iterator getIterator(){
        return new TowarIterator();
    }

    
    private class TowarIterator implements Iterator{
        private int index = 0;
        
        
        public void ReplaceIloscByName(String nazwa, int ilosc){
            for(Towar towar: lista_towarow){
                if(towar.getNazwa().equals(nazwa)){
                    towar.setIlosc(towar.getIlosc()-ilosc);
                    lista_towarow.set(index, towar);
                }
                index++;
            }
        }
    }
}
