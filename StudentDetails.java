class Student{
    String name;
    int age;
    int marks;

    void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
    }
}

public class StudentDetails{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Lokesh";
        s1.age = 18;
        s1.marks = 95;

        s2.name = "Pavan";
        s2.age = 18;
        s2.marks = 94;

        
        System.out.println("The details of first student:");
        s1.displayDetails();
        System.out.println();
        System.out.println("The details of second student:");
        s2.displayDetails();
        
    }
}