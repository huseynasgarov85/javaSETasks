package generalProblems.problems3;

import generalProblems. problems4.Product;

public abstract class Meatproduct extends Product {
    String name;

    @Override
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    double cost;

  public  Meatproduct(String name,double cost){
      this.cost=cost;
      this.name=name;
    }

    public String getInfo() {
        return name;
    }

    public double  getValue(){
         return cost;
    }





}
