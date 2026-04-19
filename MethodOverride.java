class Animal{
    void makesound(){
        System.out.println("Animal Making sound");
    }
}
class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Bow Bow Bow .......");
    }
}
class Cat extends Animal{
    @Override
    void makesound(){
        System.out.println("Meow Meow Meow .....");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makesound();         //call's dog method
        a2.makesound();         //call's cat method
    }
}
