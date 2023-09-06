import java.util.Scanner;

// Object Oriented Programming (OOP) describes objects in terms of prioperties and methods.

public class Receipt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int items = 0;
        String order = "";
        int price = 0;
        System.out.println("Hello, welcome to Ethan's Epic Edamame! Every item on the menu is $5!\nOur Menu includes:");
        System.out.println("- Edamame\n- Sour Edamame\n- Red Edamame\n- Lobster Edamame\n- Vegan Edamame\n- Salty Edamame\n- Edamame Nuggets\n- Fried Edamame\n- Steamed Edamame\n- Frozen Edamame\n- Edamargarita\n- Edamarmalade");
        while (true) {
            System.out.print("What would you like to order?: ");
            String item = scan.nextLine();
            while (!(item.toLowerCase().contains("edamame") || item.toLowerCase().contains("edamargarita") || item.toLowerCase().contains("edamarmalade"))) {
                    System.out.print("That item is not on the menu! Please try again: ");
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
            String receipt = "||****************************************Your order is " + order + 
            "|totaling " + items + " item(s).|The total for this order is $" + price + ".00.|" +
            "Thanks for shopping at Ethan's Epic Edimame, and we hope you have a great rest of your day!|" + 
            "****************************************";
        int i = 0;
        while (true) {
            for (int j = 0; j < 40; j++) {
                i += 1;
                if (receipt.charAt(i) == '|') {
                    System.out.println("");
                    break;
                }
                if (i == receipt.length() - 1) {
                    break;
                }
                System.out.print(receipt.charAt(i));
            }
            if (i == receipt.length() - 1) {
                    break;
                }
            System.out.print("\n");
        }
        scan.close();

    
    }
}