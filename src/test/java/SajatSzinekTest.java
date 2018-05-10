/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mastermind.SajatSzinek;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author minori
 */
public class SajatSzinekTest {
    
    SajatSzinek szinek;
    private List<Integer> lista;
 
    
    @Before
    public void setUp() {
        lista = new ArrayList();
        szinek = new SajatSzinek();
        lista.add(1);
    }
    
    @Test
    public void getSetTeszt(){
        szinek.setProbalkozasaim(lista);
        assertEquals(lista,szinek.getProbalkozasaim());
    }
    
    @Test
    public void szintAdHozzaTeszt(){
        szinek.szintAdHozza(1);
        assertEquals(szinek.getProbalkozasaim(), lista);
    }
    
    @Test
    public void probalkozasaimTorleseTeszt(){
        szinek.getProbalkozasaim().add(1);
        szinek.probalkozasaimTorlese();
        szinek.getProbalkozasaim().isEmpty();
    }
    

}
