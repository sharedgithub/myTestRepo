package Exceptons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
	
	public static void main(String[] args) {
		
		int a=3/0; //notice here the compiler does not throw any error because it is ArithmenticException is uncheked runtime exception
		
		//but
		try {
			System.out.println("husalkd");
		}
		
		FileReader b=new FileReader(new File(""));
		
		// here it wont compile as filenotfound is checked exception
	}

}
