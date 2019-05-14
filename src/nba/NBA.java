/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nba;

import Entidades.Equipos;
import Entidades.Jugadores;
import java.math.BigDecimal;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public static void main(String[] args) {
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        String fechaAtlanta = formato.format(fecha);
//        Date fecha = new Date();
        MetodosNba metodoNba = new MetodosNba();
        metodoNba.NumeroJugador();
        metodoNba.ActivoJugador();
        metodoNba.AllStarJugador();
        metodoNba.TitulosEquipo();
        metodoNba.SalarioJugador();
        metodoNba.PuntosJugador();
        metodoNba.PresupuestoEquipo();
        metodoNba.PosicionJugador();
        metodoNba.PaisJugador();
        metodoNba.NºAllStarJugador();
        metodoNba.MvpJugador();
        metodoNba.EquipoJugador();
        metodoNba.DivisionEquipo();
        metodoNba.ConferenciaEquipo();
        metodoNba.CiudadEquipo();
        metodoNba.CanchaEquipo();
        metodoNba.AlturaJugador();
        metodoNba.AnillosJugador();
        metodoNba.Transacción();
    }       
}
