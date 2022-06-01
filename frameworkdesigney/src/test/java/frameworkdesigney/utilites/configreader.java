package frameworkdesigney.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class configreader 

{   Properties pro;
	  
	  public  configreader() throws FileNotFoundException
	  { 
		File conf=new File("D:\\XMAS\\Config\\Configuration.properties") ;
		
		try {
			FileInputStream fis=new FileInputStream(conf);
			pro=new Properties();
			pro.load(fis);
		} catch (IOException e) 
		{
			System.out.println("Unable to read Excel File"+e.getMessage());
		}
		  
		  
	  }
	  
	  
	 
	  public String browser()
	  {
		return pro.getProperty("browser");
	
		  
	  }
	  public String url()
	  {
		  return pro.getProperty("URL");
		  
	  }
	
	

}

