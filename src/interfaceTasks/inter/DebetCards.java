package interfaceTasks.inter;

import interfaceTasks.CardService;

import java.time.LocalDate;

public class DebetCards extends Card implements CardService {
    private double amountcashIn;
    private double amountpay;
    public DebetCards(double amount, LocalDate expireDate, String cardNumber, String cvv) {
        super(amount, String.valueOf(expireDate), cardNumber, cvv);
    }

    @Override
    public void cashIn(double amount) {
        System.out.println("amount: " + amount);
        this.amountcashIn=amount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("amount: " + amount);
        this.amountpay=amount;
    }

}
