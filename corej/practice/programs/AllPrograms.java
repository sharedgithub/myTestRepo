package practice.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllPrograms {

	 //pallindrome
	//armstron number
	//factorial
	
	
	public static void main(String[] args) {
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		String input=sc.nextLine();
//		System.out.println(input);
		
		AllPrograms p=new AllPrograms();
//		p.reverseString();
//		p.printNumberPyramid(10,9);
//		p.printPyramid(4);
		p.regexFindPatter();
	}
	
	
	
	void regexFindPatter() {
		//if you only want to check the pattern then use
		String a ="your ticket number 123A12 is generated successfully";
		System.out.println(a.matches("your ticket number \\d+ is generated successfully"));
		
		System.out.println(a.matches("y[n-p].*"));
		
//		Pattern pattern=Pattern.compile("\\D*[a-zA-Z0-9]"); //use pattern object if you want to modify the string
//		Pattern pattern=Pattern.compile("\\d+");
		Pattern pattern=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9][a-zA-Z0-9]");
		Matcher matcher=pattern.matcher(a);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}
	
	
	void printNumberPyramid(int times, int number) {
	
		String s="";
		
		for(int i=0;i<times;i++) {
			s=s+" " +number;
		}
		
		System.out.println(s);
		
		if(times-1!=0) {
			printNumberPyramid(times-1,number);
		}else {
			System.out.println("End of execution");
		}
		
		
	}
	
	void printPyramid(int number) {
		
		int[][] a=new int[number][number];
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				a[i][number/2]=j;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	
	void reverseString() {
		
		String a="Arnav Rathore";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
		
		List c=Arrays.asList(a.toCharArray());
		Collections.reverse(c);
		//To be done
		
	}
	
		
	void reverseUsingRecursion(String a) {
	}
	
	void reverseUsingHalfTheLength() {
		String s="Hello World";
		char[] strArray=s.toCharArray();
		for(int i=0;i<=s.length()/2;i++) {
			char temp=strArray[i];
			strArray[i]=strArray[s.length()-i-1];
			strArray[s.length()-i-1]=temp;
			
		}
		System.out.println(Arrays.toString(strArray));
	}
	
	
	void reverseUsingStringBuffer() {
		StringBuffer a=new StringBuffer("Hello world");
		System.out.println(a.reverse());
		a.reverse();
		
	}
	
	void usingScannerClass() {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		double b=scan.nextDouble();
		System.out.println("enter the line");
		scan.nextLine();
		String c=scan.nextLine();
		 String[] arItems = scan.nextLine().split(" ");
	}

}
