package chapter6;

public class PhoneBillCalculator {

    public static void main(String args[]){

        /*******************
         * PHONE BILL
         *******************/

        //Create instance of Phone Bill class
        PhoneBill phoneBill = new PhoneBill();
        phoneBill.setId(1);
        phoneBill.setBaseCost(10);
        phoneBill.setNumberOfAllotedMinutes(10);
        phoneBill.setNumberOfMinutesUsed(20);

        double overage = phoneBill.calculateOverage();
        System.out.println("Overage" + overage);
        double totalTax=phoneBill.calculateTax();
        System.out.println("Total Tax" + totalTax);
        double totalPhoneBill =phoneBill.calculateTotalPhoneBill();
        System.out.println("Total Phone Bill" + totalPhoneBill);
    }
}
