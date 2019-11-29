package amazon;

public class Stringfrequncy {

	public static void main(String[] args) {
		String sd = "hello BAba HOw are you";
		int arr[] = new int[26];

		for (int i = 0; i < sd.length(); i++) {
			if (sd.charAt(i) == ' ')
				continue;
			if (sd.charAt(i) >= 'a')
				arr[sd.charAt(i) - 97]++;
			else
				arr[sd.charAt(i) - 65]++;
		}
		for (int i = 0; i < 26; i++) {
			if (arr[i] > 0)
				System.out.println((char) (i + 65) + " = " + arr[i]);
		}
	}

}
