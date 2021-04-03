package EmailApp;

import javax.security.auth.callback.CallbackHandler;
import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity;
    private  int defaultPasswordLength =10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the firstname and lastname

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created "+ this.firstName + " "+ this.lastName);

        //call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is :"+ this.password);

        //Combine elements to generate mail
        email = firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+department+"." +companySuffix;
        System.out.println("Your email is : "+ email);
    }


    // ask for the department
    private String setDepartment(){
        System.out.println(" Enter the department code \n1 for Sales \n2 for Development\n3 for Accounting ");
        Scanner scanner = new Scanner(System.in);
        int depChoice  = scanner.nextInt();
        if (depChoice==1){ return "Sales"; }
        else  if(depChoice==2){return "Dev";}
        else if (depChoice==3){return "Accounting";}
        else {return "";}
    }

    //generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand= (int)(Math.random() * passwordSet.length());
            password[i]= passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set the mailbox capacity

    //set hte alternate email

    //change the password


}
