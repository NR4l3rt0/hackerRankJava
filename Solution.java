package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);
    private static int N;

    public static void main(String[] args) {
    	
    	while(N != -2) {
        N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N >= 1 && N <= 100){
            if ( N % 3 == 0 && N % 2 != 0) {
                System.out.println("Weird");
            } else if (N % 2 == 0 && N > 20){
                System.out.println("Not Weird");
            } else if (N == 2 || N == 4) {
                System.out.print("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.print("Weird");
            } else {
                System.out.print("Who knows...");
            }
        } else {
            System.out.println("Number not in range");
        }
        
        
    	}
    	
        scanner.close();
    }
}
