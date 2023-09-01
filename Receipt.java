import java.util.Scanner;

public class Receipt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items = 0;
        String order = "";
        System.out.print("Hello, welcome to Ethan's Epic Edamame, what would you like to order?: ");
        while (true) {
        String item = scan.nextLine();
        while (!item.toLowerCase().contains("edimame")) {
                System.out.print("That Item is not on the menu! Please try again...");
            }
        items += 1;
        System.out.print("Is that all you would like to order?");
        }
    
        System.out.println("Hello!");
    }
}