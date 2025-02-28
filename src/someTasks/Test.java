package someTasks;

import java.util.Random;
import java.util.Scanner;

public  class Test {


    public static void task(){
        Random random=new Random();
        int[][] array=new int[6][6];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]= random.nextInt(100);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int counter=0;
        int counter1=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if ( i==0){
                    counter+=array[i][j];
                } else if (i==1) {
                    counter1+=array[i][j];
                }
                else {
                    break;
                }
            }
            System.out.println();
        }
        System.out.println(counter);
        System.out.println(counter1);


    }



}
