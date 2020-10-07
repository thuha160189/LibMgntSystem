package app.main.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileUtils {
	//read and write object to file
	public static final String DATA_DIR = System.getProperty("user.dir") + "/src/app/main/dataaccess/storage/";
	//write object
	public static void writeObject(Object ob, String type) {
		try {
			FileOutputStream fout = new FileOutputStream(DATA_DIR, true);
			ObjectOutputStream oss = new ObjectOutputStream(fout);
			oss.writeObject(ob);
			fout.close();
			oss.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public static Object readObject(String fileName) throws Exception{
		Object ob = null;
		try {
			FileInputStream f = new FileInputStream(DATA_DIR + fileName);
			ObjectInputStream o = new ObjectInputStream(f);
			ob = o.readObject();
			f.close();
			o.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			// TODO: handle exception
		}
		catch (IOException e) {
			System.out.println("Error initiallizing stream");
			// TODO: handle exception
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return ob;
		
		
	}
	
	

}
