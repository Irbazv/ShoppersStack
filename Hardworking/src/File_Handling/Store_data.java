package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.RowFilter;

public class Store_data {

	public static void main(String[] args) throws IOException  {
        File f1=new File("c://Toxic//Oreo.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("hi");
		fw.write("hello");
		fw.flush();
	}
	
	}

