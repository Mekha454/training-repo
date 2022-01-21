package com.revature.fileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTryWithResources {
	
	public static void main(String[] args) {
		
		//review of writing to a file:
		
		File myFile = new File("myFile.txt");
		/*
		 * though you can handle resources as shown below, not th ebest way of doing so
		 * there is no guarntee the resources will be closed within this try block
		 */
//		try {
//			FileWriter writer = new FileWriter(myFile, true);
//			BufferedWriter buffWriter = new BufferedWriter(writer);
//						buffWriter.write("writing to my file once again\n");
//			buffWriter.close();
//			writer.close();
//		} catch (IOException e) {
//			e.printStackTrace();
		
		/*
		 * we will instead use "try with resources"
		 * allows us t have java automatically close resources that are declard with try-with-resources syntax
		 */
		
		try(FileWriter writer = new FileWriter (myFile, true); 
				BufferedWriter buffWriter = new BufferedWriter(writer);){
			buffWriter.write("I'm using try with resources\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
				
		
		
		}
		
	}


