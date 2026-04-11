class Student {
    String name;
    int age;
    int marks;

    // Constructor
    Student(String n, int a, int m) {
        name = n;
        age = a;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}

public class Constructor1 {
    public static void main(String[] args) {

        Student s1 = new Student("Lokesh", 18, 90);
        Student s2 = new Student("Rahul", 19, 85);

        s1.displayDetails();
        s2.displayDetails();
    }
}