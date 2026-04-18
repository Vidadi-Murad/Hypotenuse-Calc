// Hypotenuse Calculator


// Library
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    scanner.useLocale(Locale.US);
    
    // Variables

    double firstSide;
    double secondSide;
    double result;
    double lastResult;
    
    // Labels for get data from user
    System.out.print("Enter First Side:");
    firstSide = scanner.nextDouble();

    // Operations
    System.out.print("enter Second Side:");
    secondSide = scanner.nextDouble();

    result = Math.pow(firstSide, 2) + Math.pow(secondSide, 2);
    lastResult = Math.sqrt(result);


    // Result
    System.out.printf("The Answer is: %.1f\n", lastResult);


    scanner.close();
    }
    
}

