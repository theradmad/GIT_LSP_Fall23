
package org.howard.edu.lsp.assignment2;
import java.io.FileNotFoundException;
public class WordCounterDriver {
	public static void main(String[] args) {
		FileReader fr = new FileReader();
		try {
			System.out.println(fr.readToString("words.txt"));	
		} catch (FileNotFoundException e) {
				e.printStackTrace(); //if file not found
				
			}
		
		
	}
}
