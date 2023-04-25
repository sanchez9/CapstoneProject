package tek.sdet.framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {
	
	// in this class we will create a method that returns
	// object of FileInputStream class so we can read the
	// any file in bytes
	// syntax for creating a method
	// accessmodifier return type and method name (parameters) {}
	
	public static FileInputStream getFileInputStream(String filePath) throws FileNotFoundException {
		return new FileInputStream(new File(filePath));
		
		
	}
	
	

}
