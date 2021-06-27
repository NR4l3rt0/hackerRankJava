package hackerrank;

import java.util.Scanner;

public class SolutionScanner {

	/* A safer way of thinking about it would be with Integer.parseInt(scan.nextLine());*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

