package filehander;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readtext {
	public static void main(String... s) {
		try {
			File f = new File("D:\\\\testing data/userstory.txt");

			BufferedReader b = new BufferedReader(new FileReader(f));

			String readLine = "";

			while ((readLine = b.readLine()) != null) {
				System.out.print(readLine + "#");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
