package app.main;

import java.io.IOException;

import app.main.model.Book;
import app.main.ui.ShowAllMemberScreen;
import app.main.ui.UI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import app.main.Main;
import app.main.ui.AddCopyBookScreen;
import app.main.ui.AddNewMemberScreen;
import app.main.ui.BookEditDialog;

public class Main  {
	private Stage primaryState;

	public static void main(String[] args) {
		AddCopyBookScreen.main(args);
	}

	

}
