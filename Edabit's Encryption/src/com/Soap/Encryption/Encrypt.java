package com.Soap.Encryption;
import java.io.IOException;
import java.util.Arrays;


public class Encrypt {
	
	public static String encrypt(String initialString) throws IOException {
		
		initialString = initialString.replaceAll("\\s", "");
//		initialString += "*";
		System.out.println(initialString);
		int length = initialString.length();
		int rows = (int) Math.sqrt(length);
		int coloumns = rows + 1;
		if(rows*coloumns >= initialString.length()) {}
		else {rows+=1;}
		char [][] twodarr = new char[rows][coloumns];
		System.out.println("Rows: " + rows + " Coloums: " + coloumns + " Length: " + initialString.length());
		int tempcol = 0;
		int temprow = 0;
		int count = 0;
		//Fills up the array
		 for (int row = 0; row < twodarr.length; row++)
		    {
		        for (int column = 0; column < twodarr[row].length; column++)
		        	
		        {
		        	try {
		        	System.out.println(row + " , " + column + " count: " + count);
		            twodarr[row][column] = initialString.charAt(count);
		            count++;
		        	}catch(StringIndexOutOfBoundsException e) {
//		        		e.printStackTrace();
		        	}
		        }
		        
		    }  
		System.out.println(Arrays.deepToString(twodarr));
		
		//Generates new strings without spaces
		String finalstring = "";
		String tempstring = "";
		for(int i = 0; i < rows; i++) {
			for(int i2 = 0; i2 < coloumns;i2++) {
				
//				try {
					finalstring += twodarr[i][i2];
					
				/*}catch(IndexOutOfBoundsException e) {
					e.printStackTrace();
				}*/
			}
			
			finalstring += " ";
		}
			
		
		

		return finalstring;
	}
	
	
	
	
}
