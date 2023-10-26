package day1;
import java.util.Scanner;

public class FrontEndCalculator {
   public static Calculator calc ;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Add two numbers");

        int first = Integer.parseInt(scan.nextLine());

        int second = Integer.parseInt(scan.nextLine());

       calc = new Calculator(first,second);

        System.out.println("Here are the results for add/sub/mul/div");

        calc.printAddition();
        calc.printSubtraction();
        calc.printMultiplication();
        calc.printDivision();

    }

}