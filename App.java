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
    
    // Labels for get data from user
    System.out.print("Enter First Side:");
    firstSide = scanner.nextDouble();

    System.out.print("enter Second Side:");
    secondSide = scanner.nextDouble();



    scanner.close();
    }
    
}

