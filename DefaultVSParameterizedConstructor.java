class Student{
    String name;
    int age;
    float marks;

    //Default Constructor
    Student(){
    name = "unknown";
    age = 0;
    marks = 0.0f;
    System.out.println("Default Constructor is called");
    }

    //Parameterized Constructor

    Student(String n, int a, float m){
        name = n;
        age = a;
        marks = m;
        System.out.println("Parameterized Constructor is called");
    }

    void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
    }
}

public class DefaultVSParameterizedConstructor{
    public static void main(String[] args) {
        
        //For Default Constructor
        Student s1 = new Student();

        //For Parameterized Constructor
        Student s2 = new Student("lokesh",18,90);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}