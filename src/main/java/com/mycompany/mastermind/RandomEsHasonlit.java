/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *A RandomEsHasonlit osztályban generálódik le a kitalálandó színkód, illetve itt történik a kipróbált színek és a szinkód összehasonlítása is.
 */
public class RandomEsHasonlit {
    
    /**
     * A szinKod listában tárolódik a kitalálandó random színkód.
     */
    private List<Integer> szinKod = new ArrayList();
    
    /**
     * A szinKodCopy lista a szinKód másolata, az összehasonlításokhoz.
     */
    private List<Integer> szinKodCopy = new ArrayList();

    /**
     * A winner változó reprezentálja, hogy hány fekete karikánk van. Ha a winner négy, akkor győztünk.
     */
    private int winner = 0;
    
    /**
     * A randomSzinGenerator metódus legenerálja a kitalálandó színkódot.
     */
    public void randomSzinGenerator(){
        
        Random szam = new Random();
        
        for(int i = 0; i<4; i++){
            szinKod.add(szam.nextInt(8)+1);
            szinKodCopy.add(szinKod.get(i));
        }
    }
    
    /**
     * A joSzinJoHelyen metódus paraméterül kapja a színkód eltalálására tett kísérletünket egy lista formájában,
     * majd megnézi, hogy van-e olyan próbálkozásunk, ami jó helyen szerepel az eredeti színkódban, és ha talál,
     * akkor az adott helyen a színkód másolatát átállítja 9-re (így többé nem lesz rá egyezés),
     * majd a winner változót növeli eggyel. Ha nem találtuk el az összes színt, akkor a winner változót lebullázza,
     * és a következő körben újra probálkozhatunk előlröl.
     * @param probalkozasaim 
     */
    public void joSzinJoHelyen(List <Integer> probalkozasaim){
        for(int i = 0; i<4; i++){
            szinKodCopy.set(i,szinKod.get(i));
            if(probalkozasaim.get(i).compareTo(szinKod.get(i)) == 0){
                szinKodCopy.set(i,9);
                probalkozasaim.set(i,10);
                winner++;
            }
        }
        if(winner < 4){
            winner = 0;
        }
    }
    
    /**
     * A joSzinRosszHelyen metódus paraméterül kapja a színkód eltalálására tett kísérletünket egy lista formájában,
     * majd megnézi, hogy van-e olyan próbálkozásunk, ami szerepel az eredeti színkódban, viszont rossz helyen
     * (jó helyen lévőt az előtte lefutó joSzinJoHelyen metódus miatt nem fog találni), és ha talál, 
     * akkor az adott helyen a szinkód másolatát átállítja nullára, hogy azt az elemet többé ne ismerje fel egyezőnek.
     * @param probalkozasaim 
     */
    public void joSzinRosszHelyen(List <Integer> probalkozasaim){
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(probalkozasaim.get(i).compareTo(szinKodCopy.get(j)) == 0){
                    szinKodCopy.set((j), 0);
                    probalkozasaim.set(i,10);
                }
            }
       }
    }
    
    /**
     * A szinKodokTorlese metódus kiüríti a legenerált szinKod listát, illetve ennek módosított másolatát,
     * és a winner változót visszaállítja a kezdeti értékre.
     */
    public void szinKodokTorlese(){
        szinKod.clear();
        szinKodCopy.clear();
        winner = 0;
    } 
    
    /**
     * A szinKodCopy lista getter metódusa.
     * @return Integer List szinKodCopy
     */
    public List<Integer> getSzinKodCopy() {
        return szinKodCopy;
    }
    
    /**
     * A szinKodCopy lista setter metódusa.
     * @param szinKodCopy 
     */
    public void setSzinKodCopy(List<Integer> szinKodCopy) {
        this.szinKodCopy = szinKodCopy;
    }

    /**
     * A winner változó getter metódusa.
     * @return int winner
     */
    public int getWinner() {
        return winner;
    }

    /**
     * A winner változó setter metódusa.
     * @param winner 
     */
    public void setWinner(int winner) {
        this.winner = winner;
    }

    /**
     * A szinKod lista getter metódusa.
     * @return List szinKod
     */
    public List<Integer> getSzinKod() {
        return szinKod;
    }

    /**
     * A szinKod lista setter metódusa.
     * @param szinKod
     */
    public void setSzinKod(List<Integer> szinKod) {
        this.szinKod = szinKod;
    }
}
