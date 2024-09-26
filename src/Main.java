import java.util.Scanner;//helps gain user input
import java.text.DecimalFormat;//helps round numbers and format them

public class Main {
    public static void main(String[] args) {
        TipCalculator bill = new TipCalculator(142.32,30.00,4);
        bill.printReceipt();
//
    }
}

//        // asking for all the static variables used in conversions
//        DecimalFormat df = new DecimalFormat("#.##"); // used to round future numbers/variables
//        Scanner s = new Scanner(System.in); // makes using Scanner easier by just having to use s
//        System.out.print("How much was the bill? ");
//        String totalBillString = s.nextLine();
//        System.out.print("WWhat tip percent would you like? ");
//        String tipPercentString = s.nextLine();
//        System.out.print("How many people in the party? ");
//        String numPeopleString = s.nextLine();
//
//
//        //converting each variable to its desired final data type
//        final double totalBill = Double.parseDouble(totalBillString);
//        final int tipPercent = Integer.parseInt(tipPercentString);
//        final int numPeople = Integer.parseInt(numPeopleString);
//
//
//        //doing the calculations for each of the non-final variables
//        double totalTipAmt = ((double) tipPercent/ 100) * totalBill; // divided the tip percent by 100 to multiply by a decimal value despite tipPercent being an integer
//        double totalBillWithTip = totalBill+totalTipAmt; // adding tip and total
//        double tipPerPerson = totalTipAmt/numPeople; // dividing the tip amount by the amount of people
//        double totalPerPerson = totalBillWithTip/numPeople; // dividing the total amount by the amount of people
//
//
//        //here is where the output is formatted
//        System.out.println();
//        System.out.println("-------------------------------");// used df.format to round decimals
//        System.out.println("The total tip amount is $" + df.format(totalTipAmt)+".");
//        System.out.println("The total bill including the tip is $" + df.format(totalBillWithTip)+".");
//        System.out.println("The tip split between all the people in the party is $" + df.format(tipPerPerson)+" per person.");
//        System.out.println("The bill split between all the people is $" + df.format(totalPerPerson)+ " per person.");
//        System.out.println("-------------------------------");