/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import adatbazis.Lekerdezesek;
import com.mycompany.mastermind.Logikak;
import com.mycompany.mastermind.RandomEsHasonlit;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author minori
 */
public class LogikakTest {
    Logikak logika;
    RandomEsHasonlit random;
    //EntityManagerFactory ef = Persistence.createEntityManagerFactory("kapcsolatom");
    //Lekerdezesek adbe = new Lekerdezesek(ef);
    
    
    @Before
    public void setUp() {
        logika = new Logikak();
        random = new RandomEsHasonlit();
    }
    
    @Test
    public void getSetProbalkozasokSzamaTeszt(){
        logika.setProbalkozasokSzama(10);
        assertEquals(10,logika.getProbalkozasokSzama());
    }
    
    @Test
    public void ujJatekGeneratorTeszt(){
        logika.setProbalkozasokSzama(10);
        logika.kisegito = 5;
        logika.kisKorIndex = 6;
        logika.ujJatekGenerator();
        assertEquals(1, logika.getProbalkozasokSzama());
        assertEquals(logika.kisKorIndex, logika.kisegito, 0);
    }
    
    @Test
    public void indexKiSegitoTeszt(){
      logika.kisKorIndex = 1;
      logika. kisegito = 2;
      logika.indexKiSegito();
      assertEquals(4, logika.kisKorIndex);
      assertEquals(logika.kisegito, logika.kisKorIndex);
      logika.kisKorIndex = 0;
      logika. kisegito = 0;
      logika.indexKiSegito();
      assertEquals(4, logika.kisKorIndex);
      assertEquals(logika.kisegito, logika.kisKorIndex);
      logika.kisKorIndex = 4;
      logika. kisegito = 3;
      logika.indexKiSegito();
      assertEquals(logika.kisegito, logika.kisKorIndex);
       
    }
    
    @Test
    public void feherKKorFelismeroTeszt(){
        random.randomSzinGenerator();
        random.getSzinKodCopy().set(0, 5);
        random.getSzinKodCopy().set(1, 0);
        assertFalse(logika.feherKKorFelismero(random, 0));
        assertTrue(logika.feherKKorFelismero(random, 1));
    }
    
    @Test
    public void feketeKKorFelismeroTeszt(){
        random.randomSzinGenerator();
        random.getSzinKodCopy().set(0, 5);
        random.getSzinKodCopy().set(1, 9);
        assertFalse(logika.feketeKKorFelismero(random, 0));
        assertTrue(logika.feketeKKorFelismero(random, 1));
    }
    
    @Test
    public void jatekVegeVizsgaloTeszt(){
        //Lekerdezesek.getAdbeInstance().csatlakozas();
        random.setWinner(4);
        logika.setProbalkozasokSzama(9);
        //assertTrue(logika.jatekVegeVizsgalo(random));
        random.setWinner(3);
        //assertTrue(logika.jatekVegeVizsgalo(random));
        logika.setProbalkozasokSzama(8);
        //assertFalse(logika.jatekVegeVizsgalo(random));
        //Lekerdezesek.getAdbeInstance().delete();
        //Lekerdezesek.getAdbeInstance().kapcsolatZaro();
    }
        
}
