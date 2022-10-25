package bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {
    static boolean validate(String pattern,String text) {
        return Pattern.compile(pattern).matcher(text).matches();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String pattern  = "^[-.+]{1}(91)[1-9]{1}[0-9]{9}$";
        System.out.println("Enter Mobile Number : ");
        String num = scan.nextLine();
        boolean isValid = validate(pattern, num);
        if (isValid) {
            System.out.println("This is Valid Mobile Number");
        } else {
            System.out.println("Not valid");
        }
    }
}
