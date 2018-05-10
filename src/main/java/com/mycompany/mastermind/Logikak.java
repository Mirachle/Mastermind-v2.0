/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mastermind;

import adatbazis.Lekerdezesek;
import adatbazis.Mastermind;

/**
 * A logika osztályban jön létre maga a játéklogika. Itt bírálódik el minden eldöntendő kérdés, 
 * és itt dől el, hogy megnyered vagy elveszted a játékot.
 */
public class Logikak {
    /**
     * A probalkozasokSzama változóban tárolódik, hogy a játékban hanyadik próbálkozásnál jársz a színkód eltalálására,
     */
    public int probalkozasokSzama = 1;

    /**
     * A kisKorIndex változóban tárolódik, hogy épp hanyadik kört kell majd kiszíneznie a kontrollernek.
     */
    public int kisKorIndex = 0;
    
    /**
     * A kisegito változó fogja helyrerakni a kisKorIndexet, ha az esetleg elcsúszna.
     */
    public int kisegito = 0;
   
    /**
     * Létrehozza az adatbáziskapcsolatot JPA-val.
     */
    //EntityManagerFactory ef = Persistence.createEntityManagerFactory("kapcsolatom");
    //Lekerdezesek adbe = new Lekerdezesek(ef);
    
    /**
     * A jatekVegeVizsgalo metódus megnézi, hogy vége van-e a játéknak, 
     * és ha igen, akkor elmenti a végeredményt az adatbázisba.
     * @param random
     * @return true, ha vége a játéknak, egyébként hamis.
     */
    public boolean jatekVegeVizsgalo(RandomEsHasonlit random){
            if(random.getWinner() == 4 || probalkozasokSzama >= 9)
                return true;
            else return false;
    } 
    
    /**
     * 
     * @param random
     * @param index
     * @return true, ha a random lista indexedik eleme 9-es, azaz 
     * (a RandomEsHasonlit osztály JoSzinRosszHelyen metódusa alapján) 
     * a próbálkozásaink indexedik eleme megegyezik a szinkóddal,
     * egyébként false
     */
    public boolean feketeKKorFelismero(RandomEsHasonlit random, int index){
            if (random.getSzinKodCopy().get(index) == 9)
                return true;
            else return false;
    }
    
    /**
     * 
     * @param random
     * @param index
     * @return true, ha a random lista indexedik eleme 0-ás, azaz 
     * (a RandomEsHasonlit osztály JoSzinRosszHelyen metódusa alapján) 
     * a próbálkozásaink indexedik eleme megegyezik a szinkóddal,
     * egyébként false
     */
    public boolean feherKKorFelismero(RandomEsHasonlit random, int index){
            if(random.getSzinKodCopy().get(index) == 0)
               return true;
            else return false;
    }
    
    /**
     * Az {@code}indexKiSegito metódus fogja nekünk helyrepakolni az eredményjelző köreink
     * indexeit abban az esetben, ha azok el akarnának csúszni.
     */
    public void indexKiSegito(){
        if(kisKorIndex%4 != 0 || kisegito==kisKorIndex)
           kisKorIndex += 4 - (kisKorIndex%4);
        kisegito = kisKorIndex;
    }
    
    /**
     * Az ujJatekGenerator metódus visszaállítja a segédváltozóinkat az 
     * alaphelyzetbe, hogy újra kedvünkre növelhessük/csökkenthessük őket.
     */
    public void ujJatekGenerator(){
        probalkozasokSzama = 1;
        kisKorIndex = 0;
        kisegito = 0;
    }

    /**
     * A probalkozasokSzama változó getter metódusa.
     * @return probalkozasokSzama
     */
    public int getProbalkozasokSzama() {
        return probalkozasokSzama;
    }

    /**
     * A probalkozasokSzama változó setter metódusa.
     * @param probalkozasokSzama 
     */
    public void setProbalkozasokSzama(int probalkozasokSzama) {
        this.probalkozasokSzama = probalkozasokSzama;
    }
}
