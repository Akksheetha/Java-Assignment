package Hands_on_9;

import java.io.FileWriter;
import java.io.IOException;

public class Creatingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter w = new FileWriter("Text.txt");
		w.write("Hey Buddy");
		w.write("I am Akkshee");
		w.close();
		System.out.println("File created");
	}

}
