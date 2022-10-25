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

//        String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}";
//        String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{8,}";
//
//        System.out.println("Enter Your Password : ");
//        String pswd = scan.next();
//        boolean isValid = validate(pattern, pswd);
//        if (isValid) {
//            System.out.println("This is Valid Password");
//        } else {
//            System.out.println("Not valid");
//        }

        String emailIdPattern = "^[a-zA-Z]+([_+-.]?[a-zA-Z0-9])*[@][a-zA-Z0-9]+[.][a-z]{2,3}([.][a-zA-Z]{2,4})?$";
        //VALID
        String validEmailArray[] = new String[9];//CREATE ARRAY
        validEmailArray[0]="abc@yahoo.com";
        validEmailArray[1]="abc-100@yahoo.com";
        validEmailArray[2]="abc.100@yahoo.com";
        validEmailArray[3]="abc111@abc.com";
        validEmailArray[4]="abc-100@abc.net";
        validEmailArray[5]="abc.100@abc.com.au";
        validEmailArray[6]="abc@1.com";
        validEmailArray[7]="abc@gmail.com.com";
        validEmailArray[8]="abc+100@gmail.com";
        System.out.println("-------------VALID EMAIL ID's-----------------");
        for (int i = 0; i < validEmailArray.length; i++) {
            boolean isValid = validate(emailIdPattern, validEmailArray[i]);
            if (isValid)
                System.out.println(i+"->Valid");
            else
                System.out.println(i+"->InValid ");
        }
        //INVALID
        String inValidEmailArray[] = new String[13];//CREATE ARRAY
        inValidEmailArray[0]="abc";
        inValidEmailArray[1]="abc@.com.my";
        inValidEmailArray[2]="abc123@gmail.a";
        inValidEmailArray[3]="abc123@.com";
        inValidEmailArray[4]="abc123@.com.com";
        inValidEmailArray[5]=".abc@abc.com";
        inValidEmailArray[6]="abc()*@gmail.com";
        inValidEmailArray[7]="abc@%*.com";
        inValidEmailArray[8]="abc..2002@gmail.com";
        inValidEmailArray[9]="abc.@gmail.com";
        inValidEmailArray[10]="abc@abc@gmail.com";
        inValidEmailArray[11]="abc@gmail.com.1a";
        inValidEmailArray[12]="abc@gmail.com.aa.au";
        System.out.println("-------------IN-VALID EMAIL ID's-----------------");
        for (int i = 0; i < inValidEmailArray.length; i++) {
            boolean isValid = validate(emailIdPattern, inValidEmailArray[i]);
            if (isValid)
                System.out.println(i+"->Valid ");
            else
                System.out.println(i+"->InValid ");
        }
    }
    }

