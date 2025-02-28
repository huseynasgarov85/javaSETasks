package generalProblems.problems3;

public class Fish extends Meatproduct {
    private String name;
    private double cost;
    public    Fish(String name,double cost){
        super(name, cost);
        this.name=name;
        this.cost=cost;
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
