package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class SolutionFloatToCurrencies {
	

		/*
		 * "Indi version, it turns out that the majority of things are not necessary
		 */
//	private static String getCurrencyFromIndia(double payment) {
//		String firstPartOfNumber = null,
//			   secondPartOfNumber = null,
//			   formattedString = null;
//		int pointIndex = 0;
//		
//
//		secondPartOfNumber = String.valueOf(payment);
//		
//		// The reference I take for constructing the String later
//		pointIndex = secondPartOfNumber.indexOf(".");
//		
//		// If it has 3 decimals == 999, this round it and put the new String in the reference secondPartOfNumber
//		if (Integer.parseInt(secondPartOfNumber.substring(pointIndex+1)) == 999) {
//
//			secondPartOfNumber = String.valueOf(Math.rint(Double.parseDouble(secondPartOfNumber)));
//
//		}
//		
//		
//		
//		
//		if (pointIndex > 3) {
//			// Operations to get the second part
//			secondPartOfNumber = secondPartOfNumber.substring(pointIndex -3);
//			// the point must be taken into account, for that reason 6
//			String patternRightPart = "%06.2f"; 
//			String rightPartOfNumberWithTwoDecimals = String.format(patternRightPart, Double.valueOf(secondPartOfNumber));
//		
//			// Operations to get the first part
//			firstPartOfNumber = String.valueOf(payment).substring(0, pointIndex -3);
//			
//	        String patternWithSymbol = "\u20B9 ##,##,##";
//	        //String patternWithRs = "##,##,##";
//			//String patternSimple = "###,###";
//	        String numberWithLeftIndiaPattern = new DecimalFormat(patternWithSymbol).format(Integer.valueOf(firstPartOfNumber));
//			
//	        
//	        // Putting it all together
//	        formattedString = "Rs." + numberWithLeftIndiaPattern +","+ rightPartOfNumberWithTwoDecimals;		
//			
//		} else {
//			
//			
//			// Up to thousands just add the local symbol
//			formattedString = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
//			
//		}
//
//		return formattedString;
//	}
	    
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        double payment;
	        
	        while(true) {
	        	System.out.println("Please, insert a double-presion number to convert: ");
	        	payment = scanner.nextDouble();
	        	
	        	if (payment >= 0 && payment <= Math.pow(10, 9)) {
	        		scanner.close();
	        		break;
	        	} else {
	        		System.out.println("Payment must be between [0, 10⁹]");
	        	}
	        	
	        }
	        

	        // Write your code here.
	        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
	        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
	        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	        
	        
	        //String india = SolutionFloatToCurrencies.getCurrencyFromIndia(payment);
	        
	        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	

}
