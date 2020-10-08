package app.main.ui;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import app.main.dataaccess.DataAccessFacade;
import app.main.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeScreen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCopyBook;

    @FXML
    private Label lblUserName;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnShowAllMember;

    @FXML
    private Button btnCheckOutBook;

    @FXML
    private Button btnAddNewMember;
    
    private List<User> users;
	
	private DataAccessFacade df;

    @FXML
    void eventAddCopyBook(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) this.btnAddNewMember.getScene().getWindow(); 			
		
		String fxmlFile="AddCopyBookScreen.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));	
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
    @FXML
    void eventShowAllMember(ActionEvent event) throws IOException {
    	
    }
    
   

    @FXML
    void eventAddNewMember(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) this.btnAddNewMember.getScene().getWindow(); 			
		
		String fxmlFile="AddNewMemberScreen.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));	
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void eventCheckOutBook(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) this.btnAddNewMember.getScene().getWindow(); 			
		
		String fxmlFile="CheckOutBookScreen.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));	
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void eventLogout(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) this.btnAddNewMember.getScene().getWindow();			
		String fxmlFile="LoginScreen.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));	
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
    	
    	df=new DataAccessFacade();
		this.users=df.loadUsers();
      
    }
}
