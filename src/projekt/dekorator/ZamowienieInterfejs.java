/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.dekorator;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import projekt.Towar;


/**
 *
 * @author Kostek
 */
public abstract class ZamowienieInterfejs {
    private int id;
    private Date data_zamowienia;
    private List<Towar> lista_towarow;
    private String imie;
    private String nazwisko;
    private Double rabat;

    public ZamowienieInterfejs() {
        this.lista_towarow = new ArrayList<Towar>();
    }
    
    public void dodajTowar(Towar towar){
        lista_towarow.add(towar);
    }
    
    public void RealizacjaZamowienia(){
       
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_zamowienia() {
        return data_zamowienia;
    }

    public void setData_zamowienia(Date data_zamowienia) {
        this.data_zamowienia = data_zamowienia;
    }

    public List<Towar> getLista_towarow() {
        return lista_towarow;
    }

    public void setLista_towarow(ArrayList<Towar> lista_towarow) {
        this.lista_towarow = lista_towarow;
    }

    public String getImie() {
        return imie;
    }

    public void setRabat(Double rabat) {
        this.rabat = rabat;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Double getRabat() {
        return rabat;
    }

}
