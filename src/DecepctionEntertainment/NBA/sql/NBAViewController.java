/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecepctionEntertainment.NBA.sql;

import Entidades.Jugadores;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.derby.client.am.Decimal;

/**
 * FXML Controller class
 *
 * @author manul
 */
public class NBAViewController implements Initializable {

    private EntityManager entityManager;
    @FXML
    private TableView<Jugadores> tableViewNba;
    @FXML
    private TableColumn<Jugadores, String> columnNombre;
    @FXML
    private TableColumn<Jugadores, String> columnApellidos;
    @FXML
    private TableColumn<Jugadores, String> columnEquipo;
    @FXML
    private TableColumn<Jugadores, Date> columnFechaNacimiento;
    @FXML
    private TableColumn<Jugadores, String> columnPais;
    @FXML
    private TableColumn<Jugadores, String> columnPosicion;
    @FXML
    private TableColumn<Jugadores, String> columnNCamiseta;
    @FXML
    private TableColumn<Jugadores, Decimal> columnPPP;
    @FXML
    private TableColumn<Jugadores, Decimal> columnAltura;
    @FXML
    private TableColumn<Jugadores, Decimal> columnSalario;
    @FXML
    private TableColumn<Jugadores, Integer> columnAñosActivos;
    @FXML
    private TableColumn<Jugadores, Integer> columnAnillos;
    @FXML
    private TableColumn<Jugadores, Boolean> columnAllStar;
    @FXML
    private TableColumn<Jugadores, Integer> columnNAllStar;
    @FXML
    private TableColumn<Jugadores, Integer> columnMvp;
    
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        columnNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        columnApellidos.setCellValueFactory(new PropertyValueFactory<>("Apellidos"));
        columnEquipo.setCellValueFactory(new PropertyValueFactory<>("equipo"));
        columnFechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("Fecha Nacimiento"));
        columnPais.setCellValueFactory(new PropertyValueFactory<>("País"));
        columnPosicion.setCellValueFactory(new PropertyValueFactory<>("Posición"));
        columnNCamiseta.setCellValueFactory(new PropertyValueFactory<>("nºcamiseta"));
        columnPPP.setCellValueFactory(new PropertyValueFactory<>("promedioPuntosPorPartido"));
        columnAltura.setCellValueFactory(new PropertyValueFactory<>("Altura"));
        columnSalario.setCellValueFactory(new PropertyValueFactory<>("Salario"));
        columnAñosActivos.setCellValueFactory(new PropertyValueFactory<>("añosActivo"));
        columnAnillos.setCellValueFactory(new PropertyValueFactory<>("Anillos"));
        columnAllStar.setCellValueFactory(new PropertyValueFactory<>("allStar"));
        columnNAllStar.setCellValueFactory(new PropertyValueFactory<>("nºallStars"));
        columnMvp.setCellValueFactory(new PropertyValueFactory<>("mvp"));
    } 
    //Consultar datos.
    public void CargarPersonas() {
        Query queryJugadoresFindAll = entityManager.createNamedQuery("Jugadores.findAll");
        List<Jugadores> listJugadores = queryJugadoresFindAll.getResultList();
        tableViewNba.setItems(FXCollections.observableArrayList(listJugadores));
    }
}