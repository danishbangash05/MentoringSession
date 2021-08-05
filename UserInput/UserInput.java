package UserInput;

import javax.xml.transform.Source;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String FirstName;
        String LastName;
        int Numbers;

        Scanner RS = new Scanner(System.in);
        System.out.println("You First Name");
        FirstName = RS.next();

        System.out.println("Enter You Last Name");
        LastName = RS.next();

        System.out.println("Enter Your Marks");
        Numbers = RS.nextInt();

        System.out.println("MarkSheet of Student: ");
        System.out.println("***************************");
        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name: " + LastName);
        System.out.println("Marks: " + Numbers);
        System.out.println("***************************");

    }
}
