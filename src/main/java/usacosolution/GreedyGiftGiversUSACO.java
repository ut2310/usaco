package usacosolution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GreedyGiftGiversUSACO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("gift1.in");
		 
		  BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  while ((st = br.readLine()) != null)
		    System.out.println(st);
		  }
	}
