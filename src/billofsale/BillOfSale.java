/*
 * WilliamBD
 * BillOfSale.java
 * This program outputs a bill of sale,
 * Based on input for price, amount payed, and tax rate.
 * Made on 02/03/2018
 */

package billofsale;

import java.util.Scanner;

/*
 *
 * @author widea9928
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Requests price of good in $
        System.out.println("Input price of item:");
        double price = scanner.nextDouble();

        //Requests amount paid by customer 
        System.out.println("Input amount payed:");
        double paid = scanner.nextDouble();
        
        //Requests tax rate percentege then transfers into decimal
        System.out.println("Input tax rate percentage:");
        double taxRate = scanner.nextDouble();
        taxRate = taxRate/100;
        
        //Calculates tax rate by multiplying the price by the tax rate, rouded to the nearest cent.
        double tax = Math.round((price*taxRate)*100)/100;
        
        //Calculates the price after taxes by adding the tax to the price paid, rounded to the nearest cent.
        double total = Math.round((tax+paid)*100)/100;
        
        //Calculates how much is owed in change by sutracting the amount paid from the total, rounded to the nearest cent.
        double change = Math.round((paid-total)*100)/100;
        
        //Outputs item price, amount paid, taxes, change, and total in dollars. 
        System.out.println("Item price: $"+price);
        System.out.println("Amount paid: $"+paid);
        System.out.println("Taxes: $"+tax);
        System.out.println("Change: $"+change);
        System.out.println("Total: $"+total);
    }
    
}
