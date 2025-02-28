package someTasks;

public enum Wolt {
    PREPARINGYOURORDER("Lookinforacourier"),
    LOOKINGFORACOURIER("COURIERISONITSWAY"),
    COURIERISONITSWAY("COURIERISDELIVERINGYOURORDER"),
    COURIERISDELIVERINGYOURORDER("finish"),
    CANCELED("canceled");

    private String melumat;
    Wolt(String melumat){
        this.melumat=melumat;
    }



    public boolean canBeChangeTo(Wolt other){
        return other.ordinal() - this.ordinal() == 1;
    }
    public void cantBeChangeTo(Wolt wolt){
        if ( (wolt.ordinal()-this.ordinal())==2 && (wolt.ordinal()-this.ordinal())==3) {
            System.out.println("this not true");
        }
    }

    public Wolt next() {
        if (this == CANCELED) return null;

        return values()[ordinal()+1];
    }


}
