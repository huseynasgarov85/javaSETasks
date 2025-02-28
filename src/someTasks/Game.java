package someTasks;

import java.util.Objects;
import java.util.Scanner;

public class Game {

    public static void paper (String num,String arr){
        if (!Objects.equals(num, arr)) {
            if (Objects.equals(num, "paper") && Objects.equals(arr, "rock")) {
                System.out.println("paper winner");
            } else if (Objects.equals(num, "paper") && Objects.equals(arr, "scissors")) {
                System.out.println("scissors winner");
            } else if (Objects.equals(num, "rock") && Objects.equals(arr, "scissors")) {
                System.out.println("rock winner");
            } else if (Objects.equals(num, "rock") && Objects.equals(arr, "paper")) {
                System.out.println("paper winner");
            } else if (Objects.equals(num, "scissors") && Objects.equals(arr, "rock")) {
                System.out.println("rock winner");
            } else if (Objects.equals(num, "scissors") && Objects.equals(arr, "paper")) {
                System.out.println("scissors winner");
            }

        }
    }
}
