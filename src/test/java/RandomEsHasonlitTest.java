/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.mastermind.RandomEsHasonlit;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author minori
 */
public class RandomEsHasonlitTest {
    
    RandomEsHasonlit hasonlit;
    private List<Integer> lista;
    private List<Integer> segedLista;
    int szamlalo;
    
    
    @Before
    public void setUp() {
        szamlalo = 0;
        hasonlit = new RandomEsHasonlit();
        lista = new ArrayList();
        segedLista = new ArrayList();
        for(int i = 1; i <=4; i++){
            lista.add(i);
            segedLista.add(i);
        }
    }
    
    
    @Test
    public void getSetSzinKodCopyTeszt(){
        hasonlit.setSzinKodCopy(lista);
        assertEquals(lista,hasonlit.getSzinKodCopy());
    }
    
    @Test
    public void getSetSzinKodTeszt(){
        hasonlit.setSzinKod(lista);
        assertEquals(lista,hasonlit.getSzinKod());
    }
    
    @Test
    public void getSetWinnerTeszt(){
        hasonlit.setWinner(1);
        assertEquals(1,hasonlit.getWinner());
    }
    
    
    @Test
    public void joSzinJoHelyenTeszt(){
        hasonlit.randomSzinGenerator();
        hasonlit.joSzinJoHelyen(lista);
        for(int i = 0; i<4; i++){
            if(segedLista.get(i).compareTo(hasonlit.getSzinKod().get(i)) == 0){
                assertEquals((int)lista.get(i), 10);
                assertEquals((int)hasonlit.getSzinKodCopy().get(i), 9);
                szamlalo++;
            }
        }
        if(szamlalo == 4)
            assertEquals(4, hasonlit.getWinner());
        else assertEquals(0, hasonlit.getWinner());
        
    }
    
    @Test
    public void joSzinRosszHelyenTeszt(){
        hasonlit.randomSzinGenerator();
        hasonlit.joSzinRosszHelyen(lista);
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(lista.get(i).compareTo(hasonlit.getSzinKod().get(j)) == 0){
                    assertEquals((int)lista.get(i), 10);
                    assertEquals((int)hasonlit.getSzinKodCopy().get(j), 0);
                }
            }
       }
    }
    
    @Test
    public void szinKodokTorleseTeszt(){
        hasonlit.setSzinKod(lista);
        hasonlit.setSzinKodCopy(lista);
        hasonlit.setWinner(10);
        hasonlit.szinKodokTorlese();
        hasonlit.getSzinKod().isEmpty();
        hasonlit.getSzinKodCopy().isEmpty();
        hasonlit.getWinner();
        assertEquals(0, hasonlit.getWinner());
    }
    
}
