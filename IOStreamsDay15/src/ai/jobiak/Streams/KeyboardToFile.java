package ai.jobiak.Streams;



import java.io.*;

public class KeyboardToFile {

	public static void main(String[] args)throws IOException {
	
		FileWriter writer=new FileWriter("mydata..txt"); 
				
	    DataInputStream dis=new DataInputStream(System.in);
			
		String data=dis.readLine();
		while(!data.equals("stop")) {
			System.out.println(data);
			data=dis.readLine();
		}
		System.out.println("data copied");
		
	}

}
