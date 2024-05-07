package File_Handling;

import java.io.File;

public class Exists {

	public static void main(String[] args) {
		File f1=new File("c://Toxic");
		if(f1.mkdirs())
		{
			System.out.println("Folder Is Created");
			
		}
		else {
			System.out.println("folder is not created");
		}
	    if(f1.exists())
	    {
	    	System.out.println("Folder is Present");
	    	
	    }
	    else {
	    	System.out.println("Folder is not Present");
	    }

	}

}
