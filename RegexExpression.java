package bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        String testName = scan.nextLine();
        String firstName = "^[A-Z][a-z]{2}[a-z]+";


        if (testName.matches(firstName)) {
            System.out.println("This is valid first name.");
        } else {
            System.out.println("Not valid name");
        }

    }
}
