package bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {
    static boolean validate(String pattern,String text) {
        return Pattern.compile(pattern).matcher(text).matches();
    }

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

        System.out.println("************************");
        String pattern = "^[A-Z]{1}[a-z]{2,}";

        System.out.println("Enter Last Name : ");

        String lastName = scan.next();

        boolean isValid = validate(pattern, lastName);

        if(isValid) {
            System.out.println("This is valid last Name.");
        }else {
            System.out.println(" Not a valid Name");
        }

    }
}
