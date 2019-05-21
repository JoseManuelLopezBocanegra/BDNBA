/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecepctionEntertainment.NBA.sql;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author manul
 */
public class NBAFXMain extends Application {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        StackPane rootMain = new StackPane();
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("NBAView.fxml"));
        Parent rootNBAView = fxmlLoader.load();
        rootMain.getChildren().add(rootNBAView);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NBAPU");
        em = emf.createEntityManager();
        
        Scene scene = new Scene(rootMain, 1275, 625);
        
        primaryStage.setTitle("NBA");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        NBAViewController NbaViewController = (NBAViewController) fxmlLoader.getController();                
        NbaViewController.setEntityManager(em);
        NbaViewController.CargarPersonas();
    }

    @Override
    public void stop() throws Exception {
        em.close();
        emf.close();
        try {
            DriverManager.getConnection("jdbc:derby:BDNBA;shutdown=true");
        } catch (SQLException ex) {
        }
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
