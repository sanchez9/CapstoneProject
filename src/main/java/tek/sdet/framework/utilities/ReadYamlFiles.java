package tek.sdet.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	private static ReadYamlFiles readYamlFiles;
	private HashMap propertyMap; // created to read the YAML Files - It does not do anything with the singletone design pattern.
	
	private ReadYamlFiles (String filepath) throws FileNotFoundException {
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filepath);
		Yaml yaml = new Yaml();
		this.propertyMap = yaml.load(fileInputStream);
		
	}
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {
		if(readYamlFiles == null)
			readYamlFiles = new ReadYamlFiles(filePath);
		return readYamlFiles;
		
	}
	
	public HashMap getYamlProperty(String key) {
		return(HashMap) this.propertyMap.get(key);
	}

}

