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

public class AddCopyBookScreen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblUserName;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnAddCopy;

    @FXML
    private TextField txtIsbn;

    @FXML
    private TextField txtNumberOfCopy;

    @FXML
    private Button btnBack;

    @FXML
    void eventAddCopy(ActionEvent event) {
    	String isbn=this.txtIsbn.getText().trim();
    	String numOfCopy=this.txtNumberOfCopy.getText().trim();
    	int numOfCopies= Integer.parseInt(numOfCopy);
    	
    	System.out.println("Book with isbn"+ isbn +"is adding number of copies of"+numOfCopy);
    	
    }

    @FXML
    void eventBack(ActionEvent event) {
    	
    	this.btnBack.getScene().getWindow().hide();

    }

    @FXML
    void eventLogout(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) this.btnLogout.getScene().getWindow();	
		
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
