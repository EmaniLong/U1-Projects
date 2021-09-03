import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class Sales {

    public static void main(String[] args) {

        DecimalFormat chickennuggets =new DecimalFormat("#,###.00");

        int salestax, discount, quantity;
        double price, subtotal, total;

        price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the item ?"));
        salestax = Integer.parseInt(JOptionPane.showInputDialog("What is the sales tax ?"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("What is the discount ?"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many Items do you have ?"));






    }




    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
}
