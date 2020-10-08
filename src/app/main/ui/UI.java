package app.main.ui;

import java.io.IOException;
import java.util.List;

import app.main.dataaccess.DataAccessFacade;
import app.main.model.Role;
import app.main.model.User;
import app.main.model.Book;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UI extends Application {
	
	private Stage stage;
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));		    
	        Scene scene = new Scene(root, 640, 400);	    
	        stage.setTitle("Login Form ");
	        stage.setScene(scene);
	        stage.show();
	        
	        this.stage=stage;

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
    private Button btnLogin;
	
	@FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;
    
	@FXML
    private Label lblUsername;
	
	private List<User> users;
	private List<Book> books;

	
	private DataAccessFacade database;
	
	
	@FXML
    void initialize() {
		database=new DataAccessFacade();
		this.users=database.loadUsers();
		this.books=database.loadBooks();
    }
	

    @FXML
    void submitEvent(ActionEvent event) throws IOException { 
    	
    	String typeUserName=this.txtUsername.getText().trim();
    	String typePass=this.txtPassword.getText().trim();

    	
    	for(User user :this.users) {
    		String userName=user.getUserName();
    		String pass=user.getPassword();
    		
    		System.out.println(pass);
    		System.out.println(typePass);
    		
    		if(pass.equals(typePass) && userName.equals(typeUserName)) {
    			
    			this.lblUsername.setVisible(false);    			
    			System.out.println("Login Successfully");    			
    			Stage stage = (Stage) this.btnLogin.getScene().getWindow();
    			String fxmlFile=this.checkRole(user);
    			System.out.println(fxmlFile);
                Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));	
                Scene scene = new Scene(root);
                stage.setScene(scene);
                this.database.setLoginUser(user);
                stage.show();
    			break;
    		}else {
    			this.lblUsername.setVisible(true);
    		}
    		
    	}

    }
    public String checkRole(User u) { 	
    	
    	List<Role> role=u.getRole();
    	
    	if(role.size()==1) {
    		if(role.get(0)==Role.ADMINISTRATOR) {
    			
    			
    			return "AdminHomeScreen.fxml";
    			
    		}else {
    			
    			return "LibraryHomeScreen.fxml";
    		}
    	}else { //both admin and librian
    		return "HomeScreen.fxml";
    	}
		
    
    }
	


	public static void main(String[] args) {
		launch(args);
	}
}
