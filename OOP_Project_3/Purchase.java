import java.util.*;

public class Purchase{

    //Initialize purchase variables
    public String itemName;
    public double itemPrice, amountDue;
    public int itemQuantity;
    public Scanner sc = new Scanner(System.in);

    public void setItemName(String newItemNAme) {
        this.itemName = newItemNAme; // Setting a value for item name
    }

    public void setTotalCost(int quantity, double price) {
        this.itemQuantity = quantity; // Setting a value for item quantity
        this.itemPrice = price; // Setting a value for item price
        this.amountDue = price * quantity; // Setting a value for amount due
    }

    public String getItemName() {
        return itemName; // Returning item name
    }

    public double getTotalCost() {
        return amountDue; // Returning amount due
    }

    public void readInput(){
        // Setting a value for item name
        System.out.print("Enter the name of the item you are purchasing: ");
        String item = sc.nextLine();
        setItemName(item); 

        // Setting a value for quantity and price
        System.out.print("Enter the quantity and price separated by a space: ");
        String quantityPrice = sc.nextLine();
        
        // String to int and double conversion
        String[] qP = quantityPrice.split(" "); 
        int a = Integer.parseInt(qP[0]);
        double b = Double.parseDouble(qP[1]);
        setTotalCost(a, b);
    }

    public void writeOutput() {
        // Printing Variables
        System.out.printf("You are purchasing %d %s(s) at %.2f\n", itemQuantity, getItemName(), itemPrice);
        System.out.printf("Amount due is %.2f\n", getTotalCost());
    }
}