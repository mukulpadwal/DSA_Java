package Lecture9_OOPs;

class Student {
    // Data Members, Properties
    String name;
    int age;

    // Constructors
    Student (){

    }

    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    Student (Student s){
        this.name = s.name;
        this.age = s.age;
    }

    // Methods
    public void getInfo(String name){
        System.out.println(this.name);
    }

    public void getInfo(int age){
        System.out.println(this.age);
    }

    public void getInfo(String name, int age){
        System.out.println(this.name + " " + this.age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("mukul", 22);
    }
}
