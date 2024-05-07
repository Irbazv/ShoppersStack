package File_Handling;

import java.io.File;
import java.io.IOException;

public class Create_file {

	public static void main(String[] args) throws IOException   {
		File f1=new File("c://toxic//oreo.txt");
		
			if(f1.createNewFile())
			{
			System.out.println("file is created");
			}
			else
			{
				System.out.println("file is not a Created");
			}
			
			
		
	

	}

}
