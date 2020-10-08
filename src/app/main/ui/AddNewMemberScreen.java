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

public class AddNewMemberScreen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblUserName;

    @FXML
    private Button btnLogOut;

    @FXML
    private Button btnAddMember;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private Button btnBack;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtAddress;

    @FXML
    void eventAddMember(ActionEvent event) {

    }

    @FXML
    void eventBack(ActionEvent event) {
    	this.btnBack.getScene().getWindow().hide();

    }

    @FXML
    void eventLogOut(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) this.btnAddMember.getScene().getWindow();	
		
		String fxmlFile="LoginScreen.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));	
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
       
    }
}
