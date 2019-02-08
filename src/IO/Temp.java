package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Temp {
	
	File a=new File();
	
	public static void main(String[] args) {
		
		
		try(BufferedReader b=new BufferedReader(new FileReader(new File("")));
				BufferedWriter c=new BufferedWriter(new FileWriter(new File("")))){
			
				String text=b.readLine();
				while(text!=null) {
					
					c.write(text);
					c.newLine();
					text=b.readLine();
				}
			
		}
		
	}

}
