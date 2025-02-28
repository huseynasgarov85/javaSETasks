package generalProblems.problems4;

import generalProblems.problems1.Cola;
import generalProblems.problems1.Water;
import generalProblems.problems2.Apple;
import generalProblems.problems2.Banana;
import generalProblems.problems3.Chicken;
import generalProblems.problems3.Fish;

import java.util.Scanner;

public class ProductOperation {

    private static Product[] product ;

    public static void productRequired() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("menyudan neçə seçim etmək istəyirsiniz?:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println("sizi bir daha gozleyirik!!");
                break;
        }
        ProductOperation.operationInfo(choice);

    }

    public static void operationInfo(int number) {

        Scanner scanner = new Scanner(System.in);
        ProductOperation.productArray();
        ProductOperation.productArraySets(number);
        System.out.println();

    }

    public static void productArray() {
         product = new Product[6];
        product[0] = new Apple("Apple", 2);
        product[1] = new Banana("Banana", 1.2);
        product[2] = new Water("Water", 0.5);
        product[3] = new Cola("Cola", 1.2);
        product[4] = new Chicken("Chicken", 13);
        product[5] = new Fish("Fish", 50.5);
    }

    public static void productArraySets(int number) {
        int counter = 0;
        Product[] array = new Product[product.length];
        for (int i = 0; i < product.length; i++) {
            array[counter] = product[i];
            counter++;
        }
        for (Product p : array) {
            System.out.println(p + " ");
        }
        Scanner scanner = new Scanner(System.in);
        int result;
        double totalPrice = 0;
        for (int i = 0; i < number; i++) {
            System.out.print("menyudaki melumatlardan necencileri isteyirsiniz?:");
            result = scanner.nextInt();
            switch (result) {
                case 1, 2, 3, 4, 5, 6:
                    System.out.println(array[result - 1]);
                    break;
            }
            totalPrice += array[result - 1].getCost();
        }

        System.out.println();
        System.out.println("Mebleq:" + totalPrice);
    }


}
