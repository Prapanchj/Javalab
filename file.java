package prjjava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class file {
	public static void main(String[] args) {
		char data[] = new char [50];
		FileReader input = null;
		FileWriter output = null;
		FileWriter write=null;
		String line="hello world";
		try {
			write = new FileWriter("input.txt");
			write.write(line);
			
			write.flush();
			write.close();
			input = new FileReader("inpu.txt");
			int byteRead = input.read(data);
			output = new FileWriter ("output.txt");
			output.write(data, 0, byteRead);
			output.flush();
			output.close();
		}
		catch (IOException e) { 
			e.printStackTrace();
		}
	}
}