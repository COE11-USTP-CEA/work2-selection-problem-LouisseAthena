import java.util.ArrayList;
import java.util.List;

public class Inventory {

    
    public static void main(String[] args) {
        
        item t1 = new item("Safeguard", "Soap", 11.00f);
        item t2 = new item("Guard", "Shampoo", 9.50f);
	item t3 = new item("Dairy Milk", "Chocolate", 50.00f);
        item t4 = new item("Tide", "Detergent", 7.50f);
        item t5 = new item("555", "Can Goods", 16.00f);
	item t6 = new item("Coca Cola", "Softdrinks", 28.00f);
        item t7 = new item("Mentos", "Candy", 3.00f);
        item t8 = new item("Bearbrand", "Milk", 14.00f);
	item t9 = new item("Happy", "Toothpaste", 6.00f);
	item t10 = new item("Nescafe", "Coffee", 6.00f);

        
        List<item> inv = new ArrayList<item>();
        inv.add(t1);
        inv.add(t2);
        inv.add(t3);
        inv.add(t4);
        inv.add(t5);
        inv.add(t6);
        inv.add(t7);
        inv.add(t8);
        inv.add(t9);
        inv.add(t10);

        for(item i:inv){
            
            System.out.println("Item: " + i.item_name);
            System.out.println("Type: " + i.cat_name);
            System.out.println("Price: " + i.price);
            
        }
        
    }
    
}
