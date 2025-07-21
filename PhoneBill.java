package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private double numberOfAllotedMinutes;
    private double numberOfMinutesUsed;

    public PhoneBill(){
         id = 0;
         baseCost = 0;
         numberOfAllotedMinutes = 0;
         numberOfMinutesUsed = 0;

    }

    public PhoneBill(int id){

    }

   public PhoneBill(int id, double baseCost, double numberOfAllotedMinutes, double numberOfMinutesUsed){
        this.id=id;
        this.baseCost=baseCost;
        this.numberOfAllotedMinutes=numberOfAllotedMinutes;
        this.numberOfMinutesUsed=numberOfMinutesUsed;

   }

   public int getId(){
        return id;
   }
   public void setId(int i){
        this.id=id;
   }
   public double getBaseCost(){
        return baseCost;

   }
   public void setBaseCost(double baseCost){
        this.baseCost=baseCost;
   }
   public double getNumberOfAllotedMinutes(){
        return numberOfAllotedMinutes;
   }
   public void setNumberOfAllotedMinutes(double numberOfAllotedMinutes){
       this.numberOfAllotedMinutes=numberOfAllotedMinutes;
   }
   public double getNumberOfMinutesUsed(){
       return  numberOfMinutesUsed;
   }
   public void setNumberOfMinutesUsed(double numberOfMinutesUsed){
        this.numberOfMinutesUsed=numberOfMinutesUsed;
   }

   public double calculateOverage(){
        return numberOfMinutesUsed-numberOfAllotedMinutes;
   }

   public double calculateTax(){
        return 0.15 * calculateTotalPhoneBill();

   }

   public double calculateTotalPhoneBill(){
       return baseCost + (1.25*calculateOverage());
   }
}
