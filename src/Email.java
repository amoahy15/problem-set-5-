import java.util.Locale;
import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 1000;
    private  int defaultPasswordLength = 12;
    private String alternateEmail;
    private String companySuffix = "WfuCSC.edu";


    //Constructor to get first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Your email is created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();


        this.password = randomPassword(defaultPasswordLength);


        email = firstName.toLowerCase(Locale.ROOT) + "." + lastName.toLowerCase(Locale.ROOT) + "@" + department + companySuffix;

    }


    //Department Name
    private String setDepartment(){
        System.out.println("New Worker: " + firstName + " \nDEPARTMENT CODES:\n1 for Sales\n2 for Devolopment\n3 for Accounting\n4 for Human Resources\n0 for None");
        Scanner scnr = new Scanner(System.in);
        int departmentChoice;
        System.out.println("Enter your department code: ");
        departmentChoice = scnr.nextInt();
        if (departmentChoice == 1){
            return "sales";
        }else if(departmentChoice == 2){
            return "dev";
        }else if(departmentChoice == 3){
            return "acc";
        }else if(departmentChoice == 4){
            return "HR";
        }else{
            return "";
        }
    }


    //Create a Random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char [] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return  new String(password);

    }
    //Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }



    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: "  + firstName + " " + lastName +
                "\nCOMPANY NAME: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
