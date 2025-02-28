package generalProblems.problems2;

import generalProblems. problems4.Product;

public abstract class Fruits extends Product {
    String name;
    double cost;
    public Fruits(String name, double cost){
        this.name=name;
        this.cost=cost;

    }

    public  String getInfo(){
        return name;
    }
    public double getCost(){
        return cost;
    }
}
