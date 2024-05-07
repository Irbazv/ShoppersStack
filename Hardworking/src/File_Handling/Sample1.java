package File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class Sample1 {

	private static final  FileReader fr = null;

	public static void main(CharBuffer args) throws IOException {
		File f1=new File("c://Toxic//Oreo.txt");
		java.io.FileReader fr=new java.io.FileReader(f1);
		char[]arr=new char [(int)f1.length()];
		((Readable) f1).read(arr);
		String s1=new String(arr);
		System.out.println(s1);
		

	}

}
