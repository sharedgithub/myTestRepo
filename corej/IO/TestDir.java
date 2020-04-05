package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TestDir {
	
	//This program will read all the files and folders inside the given folder
	//Copy all the files and folders to a specific folder
	
	Map<String,String> list;

	
	public static void main(String[] args) throws IOException {
		
		File dir1 =new File("Fold1");
		File dir2=new File("fold2");
		
		//note the package here which is java.io
		
//		FileUtils.copyDirectory("Anuj","Anuj2");FileUtils from Apache Commons IO (the easiest and safest way)
		
//		copy(dir1,dir2);
//		
//		
//		if(!dir1.isDirectory()) {
//			System.out.println(" This directory does not exist");
//			throw new FileNotFoundException();
//		}
//		
//		List<File> ne=Arrays.asList(dir1.listFiles());
//		System.out.println("Total items in the folder:"+ne.size());
//		int fileCount = 0,folderCount=0;
//		for(File f:ne) {
//			if(f.isDirectory()) {
//				folderCount++;
//			}else {
//				fileCount++;
//			}
//		}
//		System.out.println("Total files in the folder:"+fileCount);
//		System.out.println("Total folders in the folder:"+folderCount);
		
//		try(BufferedReader b=new BufferedReader(new FileReader(new File("Fold1/putty.exe")));
//				BufferedWriter o=new BufferedWriter(new FileWriter(new File("fold2/putty.exe")))){
//			String line = b.readLine();
//			while (line!=null) {
//				o.write(line);
//				o.newLine();
//				line=b.readLine();
//			}
//		}
		
		try(BufferedInputStream b=new BufferedInputStream(new FileInputStream(new File("Fold1/putty.exe")));
				BufferedOutputStream o=new BufferedOutputStream(new FileOutputStream(new File("Fold1/putty.exe")))){
			int len;
			byte[] buff=new byte[11];
			while ((len=b.read(buff))>0) {
				o.write(buff,0,len);;
			}
		}
		
	}
	
	public static void copy(File sourceLocation, File targetLocation) throws IOException {
	    if (sourceLocation.isDirectory()) {
	        copyDirectory(sourceLocation, targetLocation);
	    } else {
	        copyFile(sourceLocation, targetLocation);
	    }
	}

	private static void copyDirectory(File source, File target) throws IOException {
	    if (!target.exists()) {
	        target.mkdir();
	    }

	    for (String f : source.list()) {
	        copy(new File(source, f), new File(target, f));
	    }
	}

	private static void copyFile(File source, File target) throws IOException {        
	    try (
	            InputStream in = new FileInputStream(source);
	            OutputStream out = new FileOutputStream(target)
	    ) {
	        byte[] buf = new byte[1024];
	        int length;
	        while ((length = in.read(buf)) > 0) {
	            out.write(buf, 0, length);
			System.out.println(new String(buf));
	        }
	    }
	}
	
}
