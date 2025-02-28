package generalProblems.problems2;

public class Banana extends Fruits {
   private String name;
   private double cost;
  public Banana(String name, double cost) {
        super(name, cost);
        this.name=name;
        this.cost=cost;
    }

    @Override
    public String toString() {
        return name+" "+cost;
    }

    @Override
    public String getInfo() {
        return null;
    }


    public double getValue() {
        return 0;
    }

    public String getA(){
      return name;
    }
    public String setA(){
      return name;
    }
    public double getB(){
        return cost;
    }

    public double setB(){
        return cost;
    }
}
