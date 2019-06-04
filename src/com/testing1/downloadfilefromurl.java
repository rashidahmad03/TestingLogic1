package com.testing1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class downloadfilefromurl {

	public static void main(String[] args) throws IOException {

		String uerl = "https://www.pinkvilla.com/files";
		URL url = new URL(uerl);
		String ext = uerl.substring(uerl.length() - 4, uerl.length());
		System.out.println(ext);
		InputStream in = url.openStream();
		while (in.read() != -1)
			System.out.println(in.read());
		File file = new File("D:/TestProgram/helo.jpg");
		/*
		 * If file gets created then the createNewFile() method would return true or if
		 * the file is already present it would return false
		 */
		file.createNewFile();

		OutputStream out = new BufferedOutputStream(new FileOutputStream("D:/TestProgram/helo.jpg"));

		for (int b; (b = in.read()) != -1;) {
			out.write(b);
		}
	}

}
