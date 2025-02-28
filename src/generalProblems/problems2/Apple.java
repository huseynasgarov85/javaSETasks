package generalProblems.problems2;

public class Apple extends Fruits {
    private String name;
    private double cost;

    public Apple(String name, double cost) {
        super(name, cost);
        this.name=name;
        this.cost=cost;
    }

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



    public double getValue() {
        return 0;
    }
}
