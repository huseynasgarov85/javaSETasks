package interfaceTasks.inter;

public class CSVReport implements Report{
    @Override
    public void generated() {
        System.out.println("generate csv report ");
    }
}
