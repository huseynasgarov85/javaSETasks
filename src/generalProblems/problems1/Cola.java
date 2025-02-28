package generalProblems.problems1;

public class Cola extends Drinks {
    private String name;
    private double cost;

    public Cola(String name, double cost) {
        super(name, cost);
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " " + cost;
    }

    public String getA() {
        return name;
    }

    public String setA() {
        return name;
    }

    public double getB(){
        return cost;
    }

    public double setB(){
        return cost;
    }


}
