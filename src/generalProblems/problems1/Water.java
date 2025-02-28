package generalProblems.problems1;

public class Water extends Drinks {
    private String name;
    private double cost;
  public Water(String name,double cost){
      super(name, cost);
      this.cost= cost;
      this.name=name;
  }

    @Override
    public String toString() {
        return name+" "+cost;
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
