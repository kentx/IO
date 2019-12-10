package ken.io.test;

import java.io.FileWriter;
import java.io.IOException;

public class TestInput {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter("a.txt");
		for(int i=1;i<=5;i++){
			writer.write(i+" hello  "+"\n");
			
		}
		writer.close();

	}

}
