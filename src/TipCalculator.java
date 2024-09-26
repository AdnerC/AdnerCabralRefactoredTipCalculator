import java.text.DecimalFormat;//helps round numbers and format them
public class TipCalculator
{
    private double totalBill;
    private double tipPercent;
    private int numPeople;

    public TipCalculator(double totalBill, double tipPercent , int numPeople) {
        this.totalBill = totalBill;
        this.tipPercent = tipPercent;
        this.numPeople = numPeople;
    }

    public double totalTip()
    {
        double totalTipAmt = ((double) tipPercent/ 100) * totalBill; // divided the tip percent by 100 to multiply by a decimal value despite tipPercent being an integer
        return totalTipAmt;
    }

    public double totalBillWIthTip()
    {
        double totalBillWithTip = totalBill+ totalTip(); // adding tip and total
        return totalBillWithTip;
    }
    public double tipPerPerson()
    {
        double tipPerPerson = totalTip()/numPeople; // dividing the tip amount by the amount of people
        return tipPerPerson;
    }
    public double totalPerPerson()
    {
        double totalPerPerson = totalBillWIthTip()/numPeople; // dividing the total amount by the amount of p
        return totalPerPerson;
    }

    public void printReceipt()
    {
        DecimalFormat df = new DecimalFormat("#.##"); // used to round future numbers/variables
        System.out.println();
        System.out.println("-------------------------------");// used df.format to round decimals
        System.out.println("The total tip amount is $" + df.format(totalTip())+".");
        System.out.println("The total bill including the tip is $" + df.format(totalBillWIthTip())+".");
        System.out.println("The tip split between all the people in the party is $" + df.format(tipPerPerson())+" per person.");
        System.out.println("The bill split between all the people is $" + df.format(tipPerPerson())+ " per person.");
        System.out.println("-------------------------------");    }}

