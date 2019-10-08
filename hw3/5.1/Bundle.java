import java.util.*;

/**
   A bundle of line items that is again a line item.
*/
public class Bundle implements LineItem
{
   /**
      Constructs a bundle with no items.
   */
   public Bundle() { items = new ArrayList<>(); }

   /**
      Adds an item to the bundle.
      @param item the item to add
   */
   public void add(LineItem item) { items.add(item);}

   /**
    * get the price of an item
    * @return the price
    */
   public double getPrice()
   {
      double price = 0;

      for (LineItem item : items)
         price += item.getPrice();
      return price;
   }

   /**
    * Show description of the item
    * @return String
    */
   public String toString()
   {
      String description = "Bundle: ";
      for (int i = 0; i < items.size(); i++)
      {
         if (i > 0) description += ", ";
         description += items.get(i).toString();
      }
      return description;
   }


   /**
    * getQuantity of the item
    * @return quantity
    */
   public int getQuantity() {
      return quantity;
   }


   /**
    * Add quantity method
    * @param qty - quantity of a product (=1)
    */
   public void addQuantity(int qty) {
      quantity++;
   }

   private ArrayList<LineItem> items;
   private int quantity=0;
}
