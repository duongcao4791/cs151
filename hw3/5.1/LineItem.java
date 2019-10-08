/**
   A line item in an invoice.
*/
public interface LineItem
{
   /**
      Gets the price of this line item.
      @return the price
   */
   double getPrice();
   /**
      Gets the description of this line item.
      @return the description
   */
   String toString();

   /**
    * Get the Quantity of the product
    * @return quantity
    */
   int getQuantity();

   /**
    * Add 1 quantity of a product added
    * @param qty - quantity of a product (=1)
    */
   void addQuantity(int qty);
}
