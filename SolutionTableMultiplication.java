package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class SolutionTableMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int N;
        
        while(true) {
	        N = Integer.parseInt(bufferedReader.readLine().trim());
	
	        if (N < 2 || N > 20)
	        	System.out.println("Please, enter a number between 2 and 20");
	        else
	        	break;
        }
        
        bufferedReader.close();
        
        for (int i = 1; i <= 10; i++) {
        	System.out.println(N + " x " + i + " = " + N*i);        
        }
    }
}
