package interfaceTasks.inter;

import java.time.LocalDate;

public abstract class  Card  {
   private final double amount;
   private final LocalDate expireDate;
   private final String cardNumber;
   private final String cvv;

    protected Card(double amount, String expireDate, String cardNumber, String cvv){
        this.amount=amount;
        this.expireDate= LocalDate.parse(expireDate);
        this.cardNumber=cardNumber;
        this.cvv=cvv;
    }
    public double getA(){
        return amount;
    }
    public LocalDate setA(){
        return expireDate;
    }
    public String getB(){
        return cardNumber;
    }
    public String setB(){
        return cvv;
    }
    public double getAmount(){
        return amount;
    }
    public void showAllInfo() {
        System.out.println("amount: "+amount);
        System.out.println("expiredate: "+expireDate);
        System.out.println("cardNumber: "+cardNumber);
        System.out.println("cvv: "+cvv);
    }

    protected void myName(){
        System.out.println("Hello my name huseyn");
    }

}
