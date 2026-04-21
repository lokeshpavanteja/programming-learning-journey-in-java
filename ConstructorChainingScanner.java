import java.util.Scanner;

class Student {
    String name;
    int age;
    int[] marks;

    Student(String name) {
        this(name, 18);
        System.out.println("Constructor 1 executed");
    }

    Student(String name, int age) {
        this(name, age, new int[]{40, 50, 60});
        System.out.println("Constructor 2 executed");
    }

    Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        System.out.println("Constructor 3 executed");
    }

    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        int total = 0;
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
            total += m;
        }

        int avg = total / marks.length;

        if (avg >= 60) {
            System.out.println("\nResult: Pass");
        } else {
            System.out.println("\nResult: Fail");
        }
    }
}

public class ConstructorChainingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose option:");
            System.out.println("1. Only Name");
            System.out.println("2. Name + Age");
            System.out.println("3. Full Details");
            System.out.println("Any other number to EXIT");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                Student s = new Student(name);
                s.display();

            } else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                Student s = new Student(name, age);
                s.display();

            } else if (choice == 3) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();

                System.out.print("Enter number of subjects: ");
                int n = sc.nextInt();

                int[] marks = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.print("Enter mark " + (i + 1) + ": ");
                    marks[i] = sc.nextInt();
                }

                Student s = new Student(name, age, marks);
                s.display();

            } else {
                System.out.println("Exiting program...");
                break; // 🔥 stops loop
            }
        }

        sc.close();
    }
}