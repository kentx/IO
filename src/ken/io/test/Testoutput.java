package ken.io.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("a.txt");
		BufferedReader bfr=new BufferedReader(reader);
		while(true){
			String line=bfr.readLine();
			
			if(line==null){
				break;
			}
			System.out.println(line);
		}

	}

}
