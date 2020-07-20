package hackerrank.interview;

import java.util.Scanner;

public class SortBubble {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
for(int i=;i<a.length;i++){
    for(int j=0;j<a.length;j++)
    {
       
    }
}

    }
    public void swap(){

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}
