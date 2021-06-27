package hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	
    	LocalDate date = LocalDate.of(year, month, day);

    	return date.getDayOfWeek().toString(); // Method given from DayOfWeek class

    }

}

public class SolutionDayOfWeek {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        /*
         * Check the environment variables, $HOME will be used later for creating
         *  the path relative to the home directory.
         * 
         *  Map<String,String> environment = new HashMap<String, String>(System.getenv());
         * 
         * 	// forEach loop
	     *  for (Map.Entry<String, String> entry : environment.entrySet()) {
	     *   	System.out.println(entry.getKey() + ": " + entry.getValue());
	     *   }
	     *   
	     *   // As a lambda expression
	     *   environment.forEach((k,v) -> System.out.println(k + ": " + v));
	     */

//        
//		  I was just curious and wanted to see the System properties        
//		  but it has nothing to do with the exercise        
//        
//        Properties prop = System.getProperties();
//        Scanner sc = new Scanner(prop.toString()).useDelimiter(",");
//        while(sc.hasNext()) {
//        	System.out.println(sc.next());
//        }
 		
        File outputFile = new File(System.getenv("HOME") + "/eclipse-workspace/hackerrank/dayOfWeek.txt");
        
        BufferedWriter bufferedWriter;
        if (!outputFile.exists())
        	bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
        else
        	bufferedWriter = new BufferedWriter(new FileWriter(outputFile, true));


        int day, month, year;
        
        while(true) {
        	
            System.out.println("Please, enter a date (MM DD YYYY): ");
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

             month = Integer.parseInt(firstMultipleInput[0]);

             day = Integer.parseInt(firstMultipleInput[1]);

             year = Integer.parseInt(firstMultipleInput[2]);
        	
        	if (year < 2000 || year > 3000) 
        		System.out.println("Year must be in the range [2000, 3000] \n");
        	 else 
        		break;
        	
        }
        

        String res = Result.findDay(month, day, year);
        
        System.out.println(res);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}