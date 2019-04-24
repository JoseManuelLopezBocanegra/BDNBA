/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

import Entidades.Equipos;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Manu
 */
public class NBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Conectar con la base de datos
        Map<String, String> emfProperties = new HashMap<String, String>();
        emfProperties.put("javax.persistence.schema-generation.database.action", "create");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NBAPU", emfProperties);
        EntityManager em = emf.createEntityManager();
        
        //OPERACIONES SOBRE LA BASE DE DATOS
        Equipos equipoAtlanta = new Equipos(0, "Atlanta Hawks");
        Equipos equipoBoston = new Equipos(0, "Boston Celtics");
        Equipos equipoBrooklyn = new Equipos(0, "Brooklyn Nets");
        Equipos equipoCharlotte = new Equipos(0, "Charlotte Hornets");
        
        em.getTransaction().begin();
        em.persist(equipoAtlanta);
        em.persist(equipoBoston);
        em.persist(equipoBrooklyn);
        em.persist(equipoCharlotte);
        em.getTransaction().commit();
        
        // Cerrar la conexión con la base de datos
        em.close(); 
        emf.close(); 
        try { 
            DriverManager.getConnection("jdbc:derby:BDNBA;shutdown=true"); 
        } catch (SQLException ex) { 
        }
    }
}
