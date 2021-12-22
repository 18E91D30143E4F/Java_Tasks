package com.main;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.task.WordsSorter;

public class Main {

	public static void main(String[] args) {
		
		String paragraph = readStringFromFile("file1.txt");;
		 
		String[] sortedWords = WordsSorter.Sort(paragraph);
		
		// Write to 'File2.txt'
        try(FileWriter writer = new FileWriter("file2.txt", false))
        {
    		for (String word : sortedWords) {
    			System.out.println(word);
    			writer.append(word);
                writer.append('\n');
    		}
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
		// Write to 'File3.txt'
        try(FileWriter writer = new FileWriter("file3.txt", false))
        {
        	writer.write(paragraph);
        	writer.append('\n');
    		for (String word : sortedWords) {
    			writer.append(word);
                writer.append('\n');
    		}
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
	}
	
    private static String readStringFromFile(String filePath) 
    {
        String content = "";
 
        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
 
        return content;
    }
}
