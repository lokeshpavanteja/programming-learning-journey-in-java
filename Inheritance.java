class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int RollNo;
    int marks;

    Student(String name, int age, int RollNo, int marks){
        super(name,age);            //call parent class
        this.RollNo = RollNo;
        this.marks = marks;
    }

    void DisplayDetails(){
        System.out.println("Name is:" + name);
        System.out.println("Age :" + age);
        System.out.println("Roll number of the student is:" + RollNo);
        System.out.println("marks:" + marks);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Student s1 = new Student("Lokesh",18, 382, 98);

        s1.DisplayDetails();
    }
}