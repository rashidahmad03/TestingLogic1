package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HackerrankSolution118 {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        int s[]=new int[grades.length];
      for(int i=0;i<grades.length;i++)
      {
          if(grades[i]>37)
          {
             if(grades[i]%5>=3)
             {
                 if(grades[i]%5==4)
                 s[i]=grades[i]+1;
                if(grades[i]%5==3)
                 s[i]=grades[i]+2;
               
             
    
             
             }      
              else
                   s[i]=grades[i];
              
              
          }
           else
                   s[i]=grades[i];
      }
return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
