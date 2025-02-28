package someTasks;

public enum Meat {

    REDMEAT(1000),
    POULTRY(1000),
    SEEFOOD(1000),;
    private  int weight;
    Meat(int weight){
        this.weight=weight;
    }
    public int getInfo(){
        return this.weight;
    }


}
