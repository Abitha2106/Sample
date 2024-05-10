package org.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {
    
public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader(new File("C:\\Users\\Arulking mech\\eclipse-workspace\\SampleAPI\\src\\test\\resources\\Sample.json"));
	    ObjectMapper objectMapper = new ObjectMapper();
	    Root readValue = objectMapper.readValue(fileReader, Root.class);
	    System.out.println(readValue.getId());
	    System.out.println(readValue.getName());
	    System.out.println(readValue.getType());
	    System.out.println(readValue.getPpu());
	    
	    Batters batters = readValue.getBatters();
	    ArrayList<Batter> batter = batters.getBatter();
	    for(int i=0;i<batter.size();i++)
	    {
	    	Batter batter2 = batter.get(i);
	    	String id = batter2.getId();
	    	String type = batter2.getType();
	    	System.out.println(id +"\t" +type);
	    }
	    
	   List<Topping> topping = readValue.getTopping(); 
	   for(int j=0;j<topping.size();j++)
	   {
	         Topping topping2 = topping.get(j);
	         String id = topping2.getId();
	         String type = topping2.getType();
	         System.out.println(id+"\t" +type);
	   }
	   System.out.println("Deserialization"); 
	   
	   
  }
}
