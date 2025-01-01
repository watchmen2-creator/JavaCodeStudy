package chapter08.com.hspedu.homework;

public class Homework11 {
    public static void main(String[] args) {
        Person_ person = new Student();//向上转型
        //可以用父类有的方法
        person.run();
        person.eat();
        //子类独有的方法
        ((Student)person).study();//向下转型
    }
}
class Person_ {
    public void run() {
        System.out.println("Person is running");
    }
    public void eat() {
        System.out.println("Person is eating");
    }
}
class Student extends Person_ {
    public void run() {
        System.out.println("Student is running");
    }
    public void study() {
        System.out.println("Student is studying");
    }
}
