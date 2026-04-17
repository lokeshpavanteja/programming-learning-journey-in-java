

class Address{
    String city;
    int doorNo;

    Address(String city, int doorNo){
        this.city = city;
        this.doorNo = doorNo;
    }
    
}
class Student{
    String name;
    int rollNo;
    int age;
    Address addr;

    Student(String name, int rollNo, int age,Address addr){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.addr = addr;
    }

    void displayDetails(){
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + rollNo);
        System.out.println("Age : " + age);
        System.out.println("City : " + addr.city);
        System.out.println("Door number : " + addr.doorNo);
        System.out.println();
    }
}

public class Aggregation{
    public static void main(String[] args) {
        
        Address address = new Address("Chillangi",229);
        Student s1 = new Student("Lokesh", 382, 18, address);

        s1.displayDetails();
    }
}