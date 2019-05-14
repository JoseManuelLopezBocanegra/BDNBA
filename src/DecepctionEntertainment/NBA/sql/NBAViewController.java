/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecepctionEntertainment.NBA.sql;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;

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
    private TableColumn<Jugadores, Smallint> columnNCamiseta;
    @FXML
    private TableColumn<Jugadores, Decimal> columnPPP;
    @FXML
    private TableColumn<Jugadores, Decimal> columnAltura;
    @FXML
    private TableColumn<Jugadores, Decimal> columnSalario;
    @FXML
    private TableColumn<Jugadores, Smallint> columnAñosActivos;
    @FXML
    private TableColumn<Jugadores, Smallint> columnAnillos;
    @FXML
    private TableColumn<Jugadores, Smallint> columnAllStar;
    @FXML
    private TableColumn<Jugadores, Smallint> columnNAllStar;
    @FXML
    private TableColumn<Jugadores, Smallint> columnMvp;
    
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        columnNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        columnApellidos.setCellValueFactory(new PropertyValueFactory<>("Apellidos"));
        columnEquipo.setCellValueFactory(new PropertyValueFactory<>("Equipo"));
        columnFechaNacimiento.setCellValueFactory(new PropertyValueFactory<>("Fecha Nacimiento"));
        columnPais.setCellValueFactory(new PropertyValueFactory<>("País"));
        columnPosicion.setCellValueFactory(new PropertyValueFactory<>("Posición"));
        columnNCamiseta.setCellValueFactory(new PropertyValueFactory<>("Nº Camiseta"));
        columnPPP.setCellValueFactory(new PropertyValueFactory<>("Puntos por Partido"));
        columnAltura.setCellValueFactory(new PropertyValueFactory<>("Altura"));
        columnSalario.setCellValueFactory(new PropertyValueFactory<>("Salario"));
        columnAñosActivos.setCellValueFactory(new PropertyValueFactory<>("Años Activo"));
        columnAnillos.setCellValueFactory(new PropertyValueFactory<>("Anillos"));
        columnAllStar.setCellValueFactory(new PropertyValueFactory<>("All Star"));
        columnNAllStar.setCellValueFactory(new PropertyValueFactory<>("Nº All Stars"));
        columnMvp.setCellValueFactory(new PropertyValueFactory<>("MVP"));
    }    
    
}