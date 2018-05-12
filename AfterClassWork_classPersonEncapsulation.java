import java.util.Scanner;

class Person {
    private String name;    //name属性
    private int age;        //age属性
    public void tell() {        //tell方法
        System.out.println("name: " + name + "  age: " + age);
    }
    public String getName() {       //获取姓名，返回姓名
        return name;
    }
    public void setName(String n) {     //设置姓名属性值，形参为String
        if (n.length() > 5)
            {
                System.out.println("姓名过长！姓名不可多于5个字！");
                System.exit(-1);
            }
        else
            name = n;           //设置姓名
    }
    public int getAge() {       //获取年龄，返回年龄
        return age;
    }
    public void setAge(int a) {     //设置年龄，形参为int
        if ( a <= 0 || a > 130)     //年龄的范围为0-130
            {
                System.out.println("年龄不合理！请输入正确年龄");
                System.exit(-1);
            }
        else
            age = a;    //设置年龄
    }
}

public class Test {
    public static void main(String[] args) {        //main
        Person job = new Person();                  //实例化对象
        Scanner input = new Scanner(System.in);     //输入器
        System.out.println("请输入姓名：");
        job.setName(input.next());
        System.out.println("请输入年龄：");
        job.setAge(input.nextInt());
        System.out.println("执行getName：" + job.getName());
        System.out.println("执行getAge：" + job.getAge());
        job.tell();
    }
}