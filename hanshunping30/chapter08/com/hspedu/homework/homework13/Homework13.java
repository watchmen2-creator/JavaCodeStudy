package chapter08.com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {

    }
}

class Person {
    private String name;//姓名
    private String sex;//性别
    private int age;//年龄
    //此处先注释无参构造器，先不用这个
    //无参构造器，给属性赋默认值
//    public Person() {
//    }

    public Person(String name, String sex, int age) {
        this.setName(name);
        this.setSex(sex);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return getName() + " 爱玩...";
    }
}


class Student extends Person {

}


class Teacher extends Person {
}
