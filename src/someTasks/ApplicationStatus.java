package someTasks;

public enum ApplicationStatus {
    INITIALIZE,
    EGOV,
    MKR,
    BANK_SYSTEM,
    DONE;


    public ApplicationStatus app(){
        return values()[ordinal()+1];
    }


}
