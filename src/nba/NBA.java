/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

import Entidades.Equipos;
import Entidades.Jugadores;
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
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //String fechaAtlanta = "01/01/1946";
        //Date fecha = null;
        
        //OPERACIONES SOBRE LA BASE DE DATOS
        Equipos equipoAtlanta = new Equipos(0, "Atlanta Hawks");
        Equipos equipoBoston = new Equipos(0, "Boston Celtics");
        Equipos equipoBrooklyn = new Equipos(0, "Brooklyn Nets");
        Equipos equipoCharlotte = new Equipos(0, "Charlotte Hornets");
        Equipos equipoChicago = new Equipos(0, "Chicago Bulls");
        Equipos equipoCleveland = new Equipos(0, "Cleveland Cavaliers");
        Equipos equipoDallas = new Equipos(0, "Dallas Mavericks");
        Equipos equipoDenver = new Equipos(0, "Denver Nuggets");
        Equipos equipoDetroit = new Equipos(0, "Detroit Pistons");
        Equipos equipoGolden = new Equipos(0, "Golden State Warriors");
        Equipos equipoHouston = new Equipos(0, "Houston Rockets");
        Equipos equipoIndiana = new Equipos(0, "Indiana Pacers");
        Equipos equipoLAC = new Equipos(0, "Los Angeles Clippers");
        Equipos equipoLAL = new Equipos(0, "Los Angeles Lakers");
        Equipos equipoMemphis = new Equipos(0, "Memphis Grizzlies");
        Equipos equipoMiami = new Equipos(0, "Miami Heat");
        Equipos equipoBucks = new Equipos(0, "Milwaukee Bucks");
        Equipos equipoMinnesota = new Equipos(0, "Minnesota Timberwolves");
        Equipos equipoNOP = new Equipos(0, "New Orleans Pelicans");
        Equipos equipoNYK = new Equipos(0, "New York Knicks");
        Equipos equipoOCT = new Equipos(0, "Oklahoma City Thunder");
        Equipos equipoMagic = new Equipos(0, "Orlando Magic");
        Equipos equipoPhila = new Equipos(0, "Philadelphia 76ers");
        Equipos equipoSuns = new Equipos(0, "Phoenix Suns");
        Equipos equipoPTB = new Equipos(0, "Portland Trail Blazers");
        Equipos equipoKings = new Equipos(0, "Sacramento Kings");
        Equipos equipoSpurs = new Equipos(0, "San Antonio Spurs");
        Equipos equipoRaptors = new Equipos(0, "Toronto Raptors");
        Equipos equipoUtah = new Equipos(0, "Utah Jazz");
        Equipos equipoWizards = new Equipos(0, "Washington Wizards");
        //equipoAtlanta.setFechaFundación(fecha);
        //equipoAtlanta.getEstadio();
        Jugadores jugador1 = new Jugadores(0, "Trae", "Young");
        Jugadores jugador2 = new Jugadores(0, "Jaylen", "Adams");
        Jugadores jugador3 = new Jugadores(0, "Kent", "Bazemore");
        Jugadores jugador4 = new Jugadores(0, "Kevin", "Huerter");
        Jugadores jugador5 = new Jugadores(0, "DeAndre", "Bemdry");
        Jugadores jugador6 = new Jugadores(0, "Taurean", "Prince");
        Jugadores jugador7 = new Jugadores(0, "Vince", "Carter");
        Jugadores jugador8 = new Jugadores(0, "Justin", "Anderson");
        Jugadores jugador9 = new Jugadores(0, "John", "Collins");
        Jugadores jugador10 = new Jugadores(0, "Omari", "Spellman");
        Jugadores jugador11 = new Jugadores(0, "Dewayne", "Dedmon");
        Jugadores jugador12 = new Jugadores(0, "Alex", "Len");
        Jugadores jugador13 = new Jugadores(0, "Miles", "Plumlee");
        Jugadores jugador14 = new Jugadores(0, "Deyonta", "Davis");
        Jugadores jugador15 = new Jugadores(0, "Isaac", "Humphries");
        Jugadores jugador16 = new Jugadores(0, "Kyrie", "Irving");
        Jugadores jugador17 = new Jugadores(0, "Terry", "Rozier");
        Jugadores jugador18 = new Jugadores(0, "Brad", "Wanamaker");
        Jugadores jugador19 = new Jugadores(0, "Marcus", "Smart");
        Jugadores jugador20 = new Jugadores(0, "Jaylen", "Brown");
        Jugadores jugador21 = new Jugadores(0, "Jonathan", "Gibson");
        Jugadores jugador22 = new Jugadores(0, "Isaac", "Humphries");
        //PONER SOLO LOS QUINTETOS Y LOS MEJORES SEXTOS HOMBRES
        //jugador1.getEquipo();
        
        //Comenzar Transacción
        em.getTransaction().begin();
        em.persist(equipoAtlanta);
        em.persist(equipoBoston);
        em.persist(equipoBrooklyn);
        em.persist(equipoCharlotte);
        em.persist(equipoChicago);
        em.persist(equipoCleveland);
        em.persist(equipoDallas);
        em.persist(equipoDenver);
        em.persist(equipoDetroit);
        em.persist(equipoGolden);
        em.persist(equipoHouston);
        em.persist(equipoIndiana);
        em.persist(equipoLAC);
        em.persist(equipoLAL);
        em.persist(equipoMemphis);
        em.persist(equipoMiami);
        em.persist(equipoBucks);
        em.persist(equipoMinnesota);
        em.persist(equipoNOP);
        em.persist(equipoNYK);
        em.persist(equipoOCT);
        em.persist(equipoMagic);
        em.persist(equipoPhila);
        em.persist(equipoSuns);
        em.persist(equipoPTB);
        em.persist(equipoKings);
        em.persist(equipoSpurs);
        em.persist(equipoRaptors);
        em.persist(equipoUtah);
        em.persist(equipoWizards);
        em.persist(jugador1);
        em.persist(jugador2);
        em.persist(jugador3);
        em.persist(jugador4);
        em.persist(jugador5);
        em.persist(jugador6);
        em.persist(jugador7);
        em.persist(jugador8);
        em.persist(jugador9);
        em.persist(jugador10);
        em.persist(jugador11);
        em.persist(jugador12);
        em.persist(jugador13);
        em.persist(jugador14);
        em.persist(jugador15);
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
