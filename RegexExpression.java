package bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExpression {
    static boolean validate(String pattern,String text) {
        return Pattern.compile(pattern).matcher(text).matches();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter the first name : ");
//        String testName = scan.nextLine();
//        String firstName = "^[A-Z][a-z]{2}[a-z]+";
//
//
//        if (testName.matches(firstName)) {
//            System.out.println("This is valid first name.");
//        } else {
//            System.out.println("Not valid name");
//        }

//        System.out.println("************************");
//        String pattern = "^[A-Z]{1}[a-z]{2,}";
//
//        System.out.println("Enter Last Name : ");
//
//        String lastName = scan.next();
//
//        boolean isValid = validate(pattern, lastName);
//
//        if(isValid) {
//            System.out.println("This is valid last Name.");
//        }else {
//            System.out.println(" Not a valid Name");
//        }

//        System.out.println("******************************");
//        String email  = "^[a-zA-Z]+([_+-.][a-zA-Z])*[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2})*$";
//        System.out.println("Please Enter Email id : ");
//        String emailID = scan.nextLine();
//        boolean isValid = validate(email, emailID);
//        if (isValid) {
//            System.out.println("This is valid Email ID .");
//        } else {
//            System.out.println("Not a valid ID");
//        }
        ////////////////
//        String pattern  = "^[-.+]{1}(91)[1-9]{1}[0-9]{9}$";
//        System.out.println("Enter Mobile Number : ");
//        String num = scan.nextLine();
//        boolean isValid = validate(pattern, num);
//        if (isValid) {
//            System.out.println("This is Valid Mobile Number");
//        } else {
//            System.out.println("Not valid");
//        }
//        System.out.println("==========================");
//        String regex = "[a-zA-Z0-9]{8,}";

//        String pattern = "^[A-Z]{1}[a-zA-Z0-9]{8,}$";

        String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}";

        System.out.println("Enter Your Password : ");
        String pswd = scan.next();
        boolean isValid = validate(pattern, pswd);
        if (isValid) {
            System.out.println("This is Valid Password");
        } else {
            System.out.println("Not valid");
        }
    }
}
