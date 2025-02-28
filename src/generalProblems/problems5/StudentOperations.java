package generalProblems.problems5;

import java.util.Scanner;

public class StudentOperations {

    public static void findStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Axtarmaq istediyi studentin adini ve ya soyadini saxil et:");
        String text = scanner.next();
        boolean shert = false;
        for (int i = 0; i < Bean.students.length; i++) {
            if (text.equals(Bean.students[i].getName()) || text.equals(Bean.students[i].getSurname())) {
                System.out.println(Bean.students[i]);
                shert = true;
            }
        }
        if (!shert) {
            System.out.println("tapmadim");
        }


    }

    public static void registerStudents() {
        System.out.print("nece neferi qeydiyyatdan gecirmek isteyirsiniz?:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Bean.students = new Student[number];
        for (int i = 0; i < number; i++) {
            Student st = filStudent(scanner);
            Bean.students[i] = st;

        }
        getData();
    }

    public static void caseProcess(int select) {
        switch (select) {
            case 1:
                StudentOperations.registerStudents();
                break;
            case 2:
                StudentOperations.findStudent();
                break;
            case 3:
                getData();
                break;
            case 4:
                update();
                break;
            case 5:
                getData();
                newUpdate();
                break;
            case 6:
                getData();
                reverseInfo();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("bir daha sizi gozleyirik");
                break;
        }
    }


    public static Student filStudent(Scanner scanner) {
        System.out.print("ad daxil edin:");
        String ad = scanner.next();
        System.out.print("soyad daxil edin:");
        String surname = scanner.next();
        return new Student(ad, surname);
    }

    public static void getData() {
        for (int i = 0; i < Bean.students.length; i++) {
            System.out.println("ad:" + Bean.students[i].getName());
            System.out.println("soyad:" + Bean.students[i].getSurname());
        }
    }

    public static void update() {
        getData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("necenci:");
        int found = scanner.nextInt();
        System.out.println("yeni melumatlar daxil edin:");
        Bean.students[found - 1] = filStudent(scanner);
        System.out.println(Bean.students[found - 1]);
    }

    public static void newUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("necenci:");
        int found = scanner.nextInt();
        String name = scanner.next();
        String newSurname = scanner.next();
        Bean.students[found - 1].setName(name);
        Bean.students[found - 1].setSurname(newSurname);
        System.out.println(Bean.students[found - 1]);
    }

    public static void reverseInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("necenci");
        int found = scanner.nextInt();
        String proper = scanner.next();
        String name = scanner.next();
        String surname = scanner.next();
        if (proper.equals("ad")) {
            Bean.students[found - 1].setName(name);
            System.out.println(Bean.students[found - 1]);
        } else if (proper.equals("soyad")) {
            Bean.students[found - 1].setSurname(surname);
            System.out.println(Bean.students[found - 1]);
        } else {
            String name1 = scanner.next();
            String newSurname = scanner.next();
            Bean.students[found - 1].setName(name1);
            Bean.students[found - 1].setSurname(newSurname);
            System.out.println(Bean.students[found - 1]);
        }
    }
}
