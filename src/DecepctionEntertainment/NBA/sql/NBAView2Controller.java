/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecepctionEntertainment.NBA.sql;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author manul
 */
public class NBAView2Controller implements Initializable {

    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfApellidos;
    @FXML
    private TextField tfEquipos;
    @FXML
    private TextField tfPais;
    @FXML
    private TextField tfCamiseta;
    @FXML
    private TextField tfPPP;
    @FXML
    private TextField tfAltura;
    @FXML
    private TextField tfSalario;
    @FXML
    private TextField tfAñosActivo;
    @FXML
    private TextField tfAnillos;
    @FXML
    private TextField tfNAllStar;
    @FXML
    private TextField tfMvp;
    @FXML
    private ComboBox<?> cbAllStar;
    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private Label tfFoto;
    @FXML
    private RadioButton rbBase;
    @FXML
    private RadioButton rbEscolta;
    @FXML
    private RadioButton rbAlero;
    @FXML
    private RadioButton rbAlaPivot;
    @FXML
    private RadioButton rbPivot;
    @FXML
    private ImageView ivFoto;
    @FXML
    private Button bCancelar;
    @FXML
    private Button bGuardar;
    @FXML
    private AnchorPane rootDetalleView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OnActionButtonCancelar(ActionEvent event) {
    }

    @FXML
    private void OnActionButtonguardar(ActionEvent event) {
    }
    
}
