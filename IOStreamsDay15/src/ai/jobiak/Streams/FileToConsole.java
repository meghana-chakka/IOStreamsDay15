package ai.jobiak.Streams;


import java.io.*;
public class FileToConsole {

	public static void main(String[] args)throws IOException {
	//byte streams	
	FileInputStream fis= new FileInputStream("C:\\Users\\jobiak\\eclipse-workspace\\IOStreamsDay15\\src\\ai\\jobiak\\Streams\\FileToConsole.java");
	int data =fis.read();
	while (data!=-1) {
		System.out.print((char)data);
		data=fis.read();
	}

	}

}
