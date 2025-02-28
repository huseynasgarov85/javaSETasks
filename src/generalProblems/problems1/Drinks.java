package generalProblems.problems1;

import generalProblems. problems4.Product;

public abstract class Drinks extends Product {
    String name;
    double cost;

    Drinks(String name,double cost){
            this.cost=cost;
            this.name=name;
    }

    public String getInfo(){
        return name;
    }
    public double getValue(){
        return cost;
    }
}
