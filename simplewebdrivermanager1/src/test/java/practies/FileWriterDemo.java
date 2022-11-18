package practies;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abcd.txt",true);
		
		char[] ch = {'v','a','s','a','n','t'};
		fw.write(ch);
		fw.write("\n");
		
		String str = "Hi all, how is going your study, everything is fine?";
		fw.write(str);
		
		fw.write("\n");
		
		fw.flush();
		fw.close();

	}

}
