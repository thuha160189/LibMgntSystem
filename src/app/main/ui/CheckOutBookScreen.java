package app.main.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CheckOutBookScreen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblUserName;

    @FXML
    private Button btnLogOut;

    @FXML
    private Button btnCheckOut;

    @FXML
    private TextField txtMemberId;
    
    @FXML
    private TextField txtIsbn;   

    @FXML
    private Button btnBack;

    @FXML
    void eventBack(ActionEvent event) {
    	this.btnBack.getScene().getWindow().hide();

    }
    @FXML
    void eventLogOut(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) this.btnCheckOut.getScene().getWindow();			
		String fxmlFile="LoginScreen.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));	
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void eventCheckOut(ActionEvent event) {
    	
    	int memberId= Integer.parseInt(this.txtMemberId.getText().trim());
    	int isbn= Integer.parseInt(this.txtIsbn.getText().trim());
    	
    	System.out.println("Member with ID "+memberId + " is checking out record for book "+isbn);
    	

    }

    @FXML
    void eventMemberId(ActionEvent event) {

    }

    @FXML
    void initialize() {
       
    }
}
