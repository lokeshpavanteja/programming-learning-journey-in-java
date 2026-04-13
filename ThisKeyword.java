class Student{
    String name;
    int age;
    int rollNo;
    float CGPA;

    Student(String name, int age, int rollNo, float CGPA){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.CGPA = CGPA;
    }

    void StudentDetails(){
        System.out.println("Name of the student is : " + name);
        System.out.println("Age of the student is : " + age);
        System.out.println("The Roll Number of the student is : " + rollNo);
        System.out.println("The CGPA of the student is : " + CGPA);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        
        Student s1 = new Student("Lokesh", 18,382,9.2f);
        Student s2 = new Student("Surya",18,002,9.3f);

        s1.StudentDetails();
        System.out.println();
        s2.StudentDetails();
    }
}
