import java.util.Scanner;

public class Receipt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items = 0;
        String order = "";
        int price = 0;
        System.out.println("Hello, welcome to Ethan's Epic Edamame! Every item on the menu is $5!");
        while (true) {
            System.out.print("What would you like to order?: ");
            String item = scan.nextLine();
            while (!item.toLowerCase().contains("edamame")) {
                    System.out.print("That Item is not on the menu! Please try again: ");
                    item = scan.nextLine();
                }
            order += item + ", ";
            System.out.println(order);
            items += 1;
            price += 5;
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
            String receipt = "****************************************Your order is " + order + 
            "|totaling " + items + " item(s)| The total for this order is $" + price + ".00|" +
            "Thanks for shopping at Ethan's Epic Edimame, and we hope you have a great rest of your day!" + 
            "****************************************";

        for (int i = 0; i < Math.max(1, Math.floor(receipt.length() / 40)); i ++) {
            for (int j = 0; j < Math.min(receipt.length(), 40); j++) {
                if (receipt.charAt(i*40 + j) == '|') {
                    System.out.println("");
                    continue;
                }
                System.out.print(receipt.charAt(i*40 + j));
            }
            System.out.print("\n");
        }

    
    }
}