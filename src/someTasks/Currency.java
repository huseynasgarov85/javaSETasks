package someTasks;

public enum Currency {
    AZN(1), USD(1.7), EURO(2);

    private double rate;

    Currency(double rate) {
        this.rate = rate;
    }


    public double convert(Currency currency, double amount) {
        return (amount * currency.rate) / rate;
    }


}
