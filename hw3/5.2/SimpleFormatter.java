///**
//   A simple invoice formatter.
//*/
//public class SimpleFormatter implements InvoiceFormatter
//{
//   public String formatHeader()
//   {
//
//      total = 0;
//      return "     I N V O I C E\n\n\n";
//   }
//
//   public String formatLineItem(LineItem item)
//   {
//      total += item.getQuantity()*item.getPrice();
//     return (String.format(
//                 "%s: x%d $%.2f\n", item.toString(), item.getQuantity(), item.getQuantity() * item.getPrice()));
//   }
//
//   public String formatFooter()
//   {
//      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
//   }
//
//   private double total;
//}
