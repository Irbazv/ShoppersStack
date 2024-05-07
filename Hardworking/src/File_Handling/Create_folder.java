package File_Handling;

import java.io.File;

public class Create_folder {

	public static void main(String[] args) {
		File f1=new File("c://Toxic");
		if(f1.mkdirs())
		{
			System.out.println("Folder Is Created");
			
		}
		else {
			System.out.println("folder is not created");
		}
	
		
		
		

	}

}
