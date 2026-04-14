class Student{
    String name;
    int age;

    //Default Constructor
    Student() {
        this("Unknown", 0);
        System.out.println("Default constructor created");
    }
    
    //Constructor with one parameter
    Student(String name){
        this(name,18);
        System.out.println("One Parameter Constructor");
    }

    //Constructor with two parameters
    Student(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Two Parameter Constructor");
    }

    void display(){
        System.out.println("Name " + name + " ,age " + age);
    }
}

public class ConstructorChaining{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student("Lokesh");
        Student s3 = new Student("Lokesh", 18);

        s1.display();
        s2.display();
        s3.display();
    }
}