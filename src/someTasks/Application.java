package someTasks;

import interfaceTasks.inter.Card;

import java.util.Enumeration;
import java.util.Scanner;

public class Application {
    private static ApplicationStatus applicationStatus;
    private double amount;
    private String fin;
    private static ApplicationStatus applicationStatus1 = ApplicationStatus.INITIALIZE;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public static ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public static void setApplicationStatus(ApplicationStatus applicationStatus) {
        Application.applicationStatus = applicationStatus;
    }


    public static void initialize() {
        Scanner scanner = new Scanner(System.in);
        applicationStatus1 = applicationStatus;
        int counter = 0;
        if (applicationStatus == ApplicationStatus.INITIALIZE) {
            while (applicationStatus1.app() != null && counter < 4) {
                System.out.print("enter amount:");
                double number = scanner.nextDouble();
                System.out.print("enter fin:");
                String finCode = scanner.next();
                ApplicationStatus next = applicationStatus1.app();
//                new Application(number, finCode);
//                new Application(next);
                applicationStatus1 = next;
                if (applicationStatus1 == ApplicationStatus.EGOV) {
                    processEgov(number, finCode);
                } else if (applicationStatus1 == ApplicationStatus.MKR) {
                    processMkr(number, finCode);
                } else {
                    processBankSystem(number, finCode);
                }
                counter++;
                if (counter == 3) {
                    break;
                }
            }

        } else if (applicationStatus1 == ApplicationStatus.EGOV) {
            System.out.print("enter amount:");
            double number = scanner.nextDouble();
            System.out.print("enter fin:");
            String finCode = scanner.next();
            while (applicationStatus1.app() != null) {
                ApplicationStatus next = applicationStatus1.app();
                applicationStatus1 = next;
                break;
            }
            processMkr(number, finCode);
            processBankSystem(number, finCode);
        } else if (applicationStatus1 == ApplicationStatus.MKR) {
            System.out.print("enter amount:");
            double number = scanner.nextDouble();
            System.out.print("enter fin:");
            String finCode = scanner.next();
            while (applicationStatus1.app() != null) {
                ApplicationStatus next = applicationStatus1.app();
                applicationStatus1 = next;
                break;
            }
            processBankSystem(number, finCode);
        } else if (applicationStatus1 == ApplicationStatus.BANK_SYSTEM) {
            System.out.print("enter amount:");
            double number = scanner.nextDouble();
            System.out.print("enter fin:");
            String finCode = scanner.next();
            while (applicationStatus1.app() != null) {
                ApplicationStatus next = applicationStatus1.app();
                applicationStatus1 = next;
                break;
            }
            processDone(number, finCode);
        }
    }

    public static void processEgov(double amount, String fin) {
        System.out.println("Egov is running");
        System.out.println("amount: " + amount);
        System.out.println("fin: " + fin);
    }

    public static void processMkr(double amount, String fin) {
        System.out.println("Mkr is running");
        System.out.println("amount: " + amount);
        System.out.println("fin: " + fin);

    }

    public static void processBankSystem(double amount, String fin) {
        System.out.println("BankSystem is running");
        System.out.println("amount: " + amount);
        System.out.println("fin: " + fin);
    }

    public static void processDone(double amount, String fin) {
        System.out.println("Done");
        System.out.println("amount: " + amount);
        System.out.println("fin: " + fin);
    }

}
