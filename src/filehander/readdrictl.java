package filehander;

import java.io.File;

public class readdrictl {
	public static void main(String... a) {
	//	File f = new File("C:\\Users\\Ahmadra\\Downloads\\New folder\\rashidahmad2135@honeydew.com\\codepkg\\classes");
	String fs=	"F:/angular/AngularResume/src/assets/img/certificate";
	File f = new File(fs);
	
		for (File sss : f.listFiles())
			{
			System.out.println("certificat[]");
			System.out.println("  Name="+sss.getName().replaceAll(".jpg", ""));
			System.out.println("  URL="+sss.getPath().substring(sss.getPath().indexOf("src")+3));
			System.out.println("  Details=this update");
			System.out.println("  Org=Sololear");
			
			}
			//System.out.println(sss.replaceAll(".jpg", ""));
	}

}
