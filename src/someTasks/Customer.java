package someTasks;

import java.util.Scanner;

public class Customer {
    private static String name;
    public static String fin;
    private static  int age;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Customer.name = name;
    }

    public static String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        Customer.fin = fin;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        Customer.age = age;
    }


    public Customer(String fin ,int age) {
        Customer.fin =fin;
        Customer.age=age;
    }


    }

