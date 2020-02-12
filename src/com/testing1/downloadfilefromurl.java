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

		String uerl = "https://github.com/alxerg/Books-1/raw/master/Cracking%20the%20Coding%20Interview%2C%206th%20Edition%20189%20Programming%20Questions%20and%20Solutions.pdf";
		URL url = new URL(uerl);
		String ext = uerl.substring(uerl.length() - 4, uerl.length());

		InputStream in = url.openStream();
		System.out.println(url.getFile());
		File file = new File("D:\\testing data/codinbook" + ext);
		/*
		 * If file gets created then the createNewFile() method would return true or if
		 * the file is already present it would return false
		 */
		file.createNewFile();

		OutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\testing data/codinbook" + ext));

		for (int b; (b = in.read()) != -1;) {
			out.write(b);
		}
	}

}
