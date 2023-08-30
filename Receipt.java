import java.util.Scanner;

public class Receipt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your lucky number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter your other lucky number: ");
        int num2 = scan.nextInt();
        System.out.println("Hello, " + name + "! Your Magic number is " + ((num1*num2)+10)*2 + "!");
    }
}