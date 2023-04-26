package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGenerator {
	
	//Data Faker is a library that can help you 
	//generate random data and you can do 
	// data conditioning as well.
	
	public static void main (String []args) {
		
		System.out.println(getData("name"));
		System.out.println(getData("email"));
		System.out.println(getData("random"));
	}
	
	public static String getData(String input) {
		
		Faker faker = new Faker();
		
		String result = "";
		
		
		if(input.equals("name")) {
			result = faker.name().firstName().trim();
			
		} else if(input.equals("email")) {
			result= faker.expression("#{letterify '????.????@tekschool.us'}");
			
		}else
			result = faker.expression("#{letterify '????.????@tekschool.us'}");
		return result;
		
	}

}
