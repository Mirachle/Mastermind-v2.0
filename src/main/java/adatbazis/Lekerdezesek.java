/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adatbazis;

import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 *
 * @author minori
 */
public class Lekerdezesek {
    
    
    private static final Lekerdezesek INSTANCE = new Lekerdezesek();
    
    public static EntityManager em;
    public int idErtek = 0;
    /*
    public Lekerdezesek(EntityManagerFactory entity){
        ef = entity;
        em = ef.createEntityManager();
    }*/
    
    public static Lekerdezesek getAdbeInstance(){
        return INSTANCE;
    }
    
    public void csatlakozas(){
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("kapcsolat");
        em = ef.createEntityManager();

        //LOGGER.trace("Database connection is OK.. ");
    }
    
    public void kapcsolatZaro(){
        em.close();
        //ef.close();
    }
    
    public int szamlalo(String kifejezes){
        return getAll().stream().filter(e -> e.getVégeredmény().equals(kifejezes)).collect(Collectors.toList()).size();
    }
    
    public List<Mastermind> getAll(){
        Query query = em.createQuery("SELECT e FROM Mastermind e");
        return (List<Mastermind>) query.getResultList();
    }
    
    public void insert(Mastermind eredmeny){
        em.getTransaction().begin();
        em.persist(eredmeny);
        em.getTransaction().commit();
    }
    public void delete(){
       List<Mastermind> torlendok = getAll();
        em.getTransaction().begin();
        torlendok.forEach(e -> em.remove(e));
        em.getTransaction().commit();
    }
    
    public void gyoztemSorBetol(){
                Mastermind sor = new Mastermind();
                sor.setVégeredmény("gyoztem");
                sor.setId(idErtek);
                idErtek++;
                Lekerdezesek.getAdbeInstance().insert(sor);
    }
    
    public void vesztekSorBetol(){
                Mastermind sor = new Mastermind();
                sor.setVégeredmény("vesztettem");
                sor.setId(idErtek);
                idErtek++;
                Lekerdezesek.getAdbeInstance().insert(sor);
    }
}
