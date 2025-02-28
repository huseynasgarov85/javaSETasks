import interfaceTasks.inter.SuccessfullyResponse;
import someTasks.Exception;
import someTasks.Meat;

import java.io.IOException;
import java.util.*;

public class Main {

//    public static Student[] products;

    //    private static Wolt current = Wolt.PREPARINGYOURORDER;
    private static Map<Character, Integer> romeNumMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
//        Scanner scanner=new Scanner(System.in);
//        //sual paramet customer obyekti qebul etse mainde hansi parameterler gondere bilereme
//        while (true) {
//            System.out.println("1.register\n" +
//                    "2.axtarish\n" +
//                    "3.printall\n" +
//                    "4.update\n" +
//                    "5.newupdate\n" +
//                    "6.fullupdate"
//            );
//            System.out.println("hansini secmek isteyirsiniz:?");
//            int number = scanner.nextInt();
//            StudentOperations.caseProcess(number);
//        }


//        Main.getInfo();

        //  ProductOperation.productRequired();


//        int[] array = {1,2,3,-12,4,5,6,0,-999};
//        int min1 = array[0];
//        int counter = 0;
//        int[] arr = new int[array.length - 1];
//        int min2 = 0;
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (min1 > array[j]) {
//                    min1 = array[j];
//                }
//            }
//            for (int k = 0; k < array.length; k++) {
//                if (array[k] != min1) {
//                    arr[counter++] = array[k];
//                }
//            }
//            min2 = arr[0];
//            for (int m = 0; m < arr.length; m++) {
//                if (min2 > arr[m]) {
//                    min2 = arr[m];
//                }
//            }
//        }
//        System.out.println(min1);
//        System.out.println(min2);
//        int[] array = {1, 2, 3, -12, 4, 5, 6, 0, -999};
//        int min1 = array[0];
//        int min2 = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (min1 > array[i]) {
//                min1 = min2;
//                min1 = array[i];
//            } else if (min2 > array[i]) {
//                min2 = array[i];
//            }
//        }


//        romeNumMap.put('I', 1);
//        romeNumMap.put('V', 5);
//        romeNumMap.put('X', 10);
//        romeNumMap.put('L', 50);
//        romeNumMap.put('C', 100);
//        romeNumMap.put('D', 500);
//        romeNumMap.put('M', 1000);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter rome Number:");
//        String romeNum = scanner.next();
//        int num = getRomeNumber(romeNum);
//        System.out.println(num);


    }

    public static int getRomeNumber(String romeNumber) {
        int total = 0;
        int prevValue = 0;

        for (int i = romeNumber.length() - 1; i >= 0; i--) {
            char currentChar = romeNumber.charAt(i);
            int currentValue = romeNumMap.get(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }
        return total;
    }

    public static void getInfo() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Meat.values().length; i++) {
            for (int j = 0; j < Meat.values().length; j++) {
                System.out.println(Meat.values()[j] + " ");
            }
            System.out.print("Enter one meal:");
            int num = scanner.nextInt();
            Meat meat = Meat.values()[num - 1];
            System.out.print("Enter weight:");
            int weight = scanner.nextInt();
            processEnum(meat, weight);

        }

    }

    public static void processEnum(Meat meat, int weight) throws Exception {
        try {
            if (weight < meat.getInfo()) {
                System.out.println("you may go");
            } else {
                throw new Exception("invalide weight");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}


