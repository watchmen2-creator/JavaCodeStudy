package chapter08.com.hspedu.extend_;
//大学生--模拟大学生考试的情况
public class Gradute {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("大学生 " + name + " 正在考高等学数学...");
    }

    //打印信息
    public void showInfo() {
        System.out.println("大学生姓名：" + name + "\t年龄：" + age + "\t分数：" + score);
    }

}
