import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName = scnr.next();
        String lastName = scnr.next();



        Email em1 = new Email(firstName, lastName);

        System.out.println(em1.showInfo());




    }
}
