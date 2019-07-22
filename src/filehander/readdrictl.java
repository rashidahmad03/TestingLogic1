package filehander;

import java.io.File;

public class readdrictl {
	public static void main(String... a) {
		File f = new File("C:\\Users\\Ahmadra\\Downloads\\New folder\\rashidahmad2135@honeydew.com\\codepkg\\classes");
		for (String sss : f.list())
			System.out.println(sss.replaceAll(".cls", ""));
	}

}
