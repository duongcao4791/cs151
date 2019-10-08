import javax.swing.*;

/**
   A simple invoice formatter.
*/
public class htmlFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {

      total = 0;
      //return "     I N V O I C E\n\n\n";
      String invoiceHeader = String.format("<b><h1 style = 'color: red'; align = 'center' >"+ "INVOICE" + "</h1></b><br><br><br>");
      return invoiceHeader;
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getQuantity()*item.getPrice();
      String lineItem = (String.format(
                 "<p><b style = 'color: Blue'>%s</b>: <b style = 'color :green'>x%d</b> <b style = 'color:Orange'><i> $%.2f </i></b></p>",
              item.toString(), item.getQuantity(), item.getQuantity() * item.getPrice()));
      return lineItem;
   }

   public String formatFooter()
   {

      String footer = (String.format("<br><br><b><big><u><h2 style = 'color:Purple'; align = 'center'> " +
              "TOTAL DUE:" +"</u>" + "<i> $%.2f</i></h2></big></b><br>", total));
      return footer;
   }

   private double total;
}
