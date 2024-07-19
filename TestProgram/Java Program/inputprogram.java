import java.util.Scanner;

class inputprogram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Your full name is " + firstName + " " + lastName);;
    }
}