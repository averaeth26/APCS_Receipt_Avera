import java.util.Scanner;

public class Receipt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items = 0;
        String order = "";
        System.out.println("Hello, welcome to Ethan's Epic Edamame!");
        while (true) {
        System.out.print("what would you like to order?: ");
        String item = scan.nextLine();
        while (!item.toLowerCase().contains("edamame")) {
                System.out.print("That Item is not on the menu! Please try again: ");
                item = scan.nextLine();
            }
        items += 1;
        order += item + ", ";
        System.out.println(order);
        if (items == 5) {
            System.out.println("You have reached the maximum amount of items!");
            break;
        }
        System.out.print("Is that all you would like to order? (y/n): ");
        String confirmation = scan.nextLine();
        if (confirmation.toLowerCase().contains("y")) {
            break;
        }


        }
    
    }
}