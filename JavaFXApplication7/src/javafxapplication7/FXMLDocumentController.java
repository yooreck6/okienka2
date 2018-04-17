/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Student
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

     @FXML
    private TextField imie;
    
    
    @FXML
    private void welcome(ActionEvent event) {
        label.setText("Witaj "+imie.getText());
    }
    
        
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
