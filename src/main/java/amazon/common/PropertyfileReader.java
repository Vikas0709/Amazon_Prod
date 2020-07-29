package amazon.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileReader {
	Properties obj =new Properties();

	public  PropertyfileReader(){
		File file = new File("C:\\Users\\Vikas Sreeram\\eclipse-workspace\\Amazon_Prod2\\src\\main\\resources\\configfile\\config.properties");
		FileInputStream fis=null;{
			try {
				fis=new FileInputStream(file);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		}
	         try {
				obj.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	public String getprop(String key){
		String value=obj.getProperty(key);
		return value;
	}
	}



