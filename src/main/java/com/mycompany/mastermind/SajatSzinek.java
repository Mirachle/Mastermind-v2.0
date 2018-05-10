/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mastermind;

import java.util.ArrayList;
import java.util.List;


/**
 * A SajatSzinek osztály reprezentálja azokat a színváltozatokat, amiket jelenleg ki szeretnénk próbálni, hogy megoldás-e.
 */
public class SajatSzinek {
    
    /**
     * Ebben a listában fogjuk tárolni a színpróbálkozásaink a szín sorszáma szerint.
     */
    private List<Integer> probalkozasaim = new ArrayList();

    /**
     * A próbálkozásaim lista getter metódusa.
     * @return probalkozasaim
     */
    public List<Integer> getProbalkozasaim() {
        return probalkozasaim;
    }
    /**
     * A próbálkozásaim lista setter metódusa.
     * @param probalkozasaim 
     */
    public void setProbalkozasaim(List<Integer> probalkozasaim) {
        this.probalkozasaim = probalkozasaim;
    }
    /**
     * A kiválasztott színeket adja hozzá a próbálkozásainkhoz.
     * @param szin 
     */
    public void szintAdHozza(Integer szin){
            this.probalkozasaim.add(szin);
    }
    /**
     * Kiüríti a próbálkozásaim listát.
     */
    public void probalkozasaimTorlese(){
        probalkozasaim.clear();
    } 
    
}