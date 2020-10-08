package app.main.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import app.main.model.Address;
import app.main.model.LibraryMember;
import app.main.model.Person;
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
    private TextField txtId;
    
    @FXML
    private Label lblError;
    
  


    @FXML
    void eventAddMember(ActionEvent event) {
    	System.out.println("Add Member button Clicked");
    	
    	String id= this.txtId.getText().trim();
    	String firstName=this.txtAddress.getText().trim();
    	String lastName=this.txtLastName.getText().trim();
    	String phone= this.txtPhone.getText().trim();
    	String address=this.txtAddress.getText().trim();
    	Person member= new LibraryMember(id, firstName, lastName, phone);   	

    
    	
    		String addr[]= address.split(","); 
    		
    		System.out.println(addr.length);
    		
    		if (addr.length == 5 ) {
    			this.lblError.setVisible(false);
    			
    			Address add= new Address(addr[0], addr[1], addr[2], addr[3]);
            	member.setAddress(add);
            	
            	System.out.println("Library Memmber successfully added");
            	System.out.println(member.toString());    			
    		    			
    		}else {
    			this.lblError.setVisible(true);
    		
    		}
        	
    	
    	
    

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
