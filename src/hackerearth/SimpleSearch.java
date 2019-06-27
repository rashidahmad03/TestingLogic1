package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimpleSearch {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		String asd = br.readLine();
		String csd[] = asd.split(" ");
		String K = br.readLine();

		ArrayList<String> lsd = new ArrayList<String>();
		for (String a : csd)
			lsd.add(a);
		System.out.println(lsd.indexOf(K));

	}
}
