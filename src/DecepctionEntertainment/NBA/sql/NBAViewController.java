/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecepctionEntertainment.NBA.sql;

import Entidades.Jugadores;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
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
    @FXML
    private TextField textFieldNombre;
    @FXML
    private TextField textFieldApellidos;
    @FXML
    private Button buttonCodeGuardar;
    @FXML
    private Button bNuevo;
    @FXML
    private Button bEditar;
    @FXML
    private Button bBorrar;
    @FXML
    private AnchorPane rootNBAView;
    
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        columnNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        columnApellidos.setCellValueFactory(new PropertyValueFactory<>("Apellidos"));
        columnEquipo.setCellValueFactory(cellData -> {
        SimpleStringProperty property = new SimpleStringProperty();
        if (cellData.getValue().getEquipo() != null) {
            property.setValue(cellData.getValue().getEquipo().getNombre());
        }
        return property;
    });
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
        
        tableViewNba.getSelectionModel().selectedItemProperty().addListener(
        (observable, oldValue, newValue) -> {
            jugadorSeleccionado = newValue;
            if (jugadorSeleccionado != null) {
                textFieldNombre.setText(jugadorSeleccionado.getNombre());
                textFieldApellidos.setText(jugadorSeleccionado.getApellidos());
            } else {
                textFieldNombre.setText("");
                textFieldApellidos.setText("");
            }
        });
    } 
    //Consultar datos.
    public void CargarPersonas() {
        Query queryJugadoresFindAll = entityManager.createNamedQuery("Jugadores.findAll");
        List<Jugadores> listJugadores = queryJugadoresFindAll.getResultList();
        tableViewNba.setItems(FXCollections.observableArrayList(listJugadores));
    }
    
    @FXML
    private void onActionButtonGuardar(ActionEvent event) {
        if (jugadorSeleccionado != null) {
            jugadorSeleccionado.setNombre(textFieldNombre.getText());
            jugadorSeleccionado.setApellidos(textFieldApellidos.getText());
            entityManager.getTransaction().begin();
            entityManager.merge(jugadorSeleccionado);
            entityManager.getTransaction().commit();

            int numFilaSeleccionada = tableViewNba.getSelectionModel().getSelectedIndex();
            tableViewNba.getItems().set(numFilaSeleccionada, jugadorSeleccionado);
            TablePosition pos = new TablePosition(tableViewNba, numFilaSeleccionada, null);
            tableViewNba.getFocusModel().focus(pos);
            tableViewNba.requestFocus();
        }
    }
    
    private Jugadores jugadorSeleccionado;

    @FXML
    private void onActionButtonNuevo(ActionEvent event) {
        try {
    // Cargar la vista de detalle
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("rootDetalleView.fxml"));
    Parent rootDetalleView = fxmlLoader.load();     

    // Ocultar la vista de la lista
    rootNBAView.setVisible(false);
	
    // Añadir la vista de detalle al StackPane principal para que se muestre
    StackPane rootMain = (StackPane)rootNBAView.getScene().getRoot();
    rootMain.getChildren().add(rootDetalleView);
        } catch (IOException ex) {
    Logger.getLogger(NBAViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onActionButtonEditar(ActionEvent event) {
        try {
    // Cargar la vista de detalle
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("rootDetalleView.fxml"));
    Parent rootDetalleView = fxmlLoader.load();     

    // Ocultar la vista de la lista
    rootNBAView.setVisible(false);
	
    // Añadir la vista de detalle al StackPane principal para que se muestre
    StackPane rootMain = (StackPane)rootNBAView.getScene().getRoot();
    rootMain.getChildren().add(rootDetalleView);
        } catch (IOException ex) {
    Logger.getLogger(NBAViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onActionButtonBorrar(ActionEvent event) {
    }
}