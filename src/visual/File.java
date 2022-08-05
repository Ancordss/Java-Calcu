/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visual;
//importanto paquetes para manejo de archivos

import java.io.FileNotFoundException;
import java.io.IOException;
/*
import java.io.File;
import java.io.FileWriter;*/

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
 

/**
 *
 * @author james
 */
public class File {
    /*
    
static File file = null;
//Declaring reference of FileWriter class
static FileWriter filewriter = null;
    public static void insert(String s)
        throws IOException 
    {
        //String data = "TechBlogStation";
try {
	file = new File("D:/UNI/4tosemestre/prograll/tarea_calcu/Calcu/ext/bitacora.txt");
//Creating Object of FileWriter class
	filewriter = new FileWriter(file);
//Writing to the file
	filewriter.write(s);
//Closing the stream
	filewriter.close();
	System.out.println("File writing done.");
}
//Handing Exception
catch (Exception e) {
	e.printStackTrace();
} finally {
	try {
		if (filewriter != null) {
			filewriter.close();
		}
		} catch (Exception e) {
		e.printStackTrace();
	}
    } 
        
    
    }*/

  

    
   //define the rute of the txt
    static Path fileName = Path.of(
            "D:/UNI/4tosemestre/prograll/tarea_calcu/Calcu/ext/bitacora.txt");
    
    public static void insert(String s)
        throws IOException 
    {   
        String d = "\r\n";
        Files.writeString(fileName, d,StandardOpenOption.APPEND);
        //Files.writeString(fileName, s);
        Files.writeString(fileName, s,StandardOpenOption.APPEND);
        
    }
    /*
    public static String read()
            throws IOException{
        
        //String file_content = Files.readString(fileName);
        //return file_content;
        String num1;
        java.io.File file = new java.io.File("D:/UNI/4tosemestre/prograll/tarea_calcu/Calcu/ext/bitacora.txt");
        
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                String num = input.nextLine();
               
           }
        

    }*/
    
    /*
    public static void main(String[] args)
        throws IOException
    {
        // Assigning the content of the file
        String text
            = "Welcome to geekforgeeks\nHappy Learning!";
 
        // Defining the file name of the file
        static Path fileName = Path.of(
            "/Users/mayanksolanki/Desktop/demo.docx");
 
        // Writing into the file
        Files.writeString(fileName, text);
 
        // Reading the content of the file
        String file_content = Files.readString(fileName);
 
        // Printing the content inside the file
        System.out.println(file_content);
    }*/
    
}
