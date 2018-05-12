public class Test {
    static class Person {
        public String name;     //name 
        public int age;     //age
        public String sex;  //sex
        public void study(){
            System.out.println("Studying!");
        }
        public void showAge(){
            System.out.println("age is : " + age);
        }
        public void addAge(int i){      //age plus i
            age += i;   
        }
    }
    public static void main(String[] args) {
        Person job = new Person();
        job.name = "zhangsan";
        job.age = 20;
        job.sex = "男";
        job.study();
        job.showAge();
        System.out.println("after addAge(5) : ");
        job.addAge(5); 
        job.showAge();
    }
}
/*
class Person {
        public String name;     //name 
        public int age;     //age
        public String sex;  //sex
        public void study(){
            System.out.println("Studying!");
        }
        public void showAge(){
            System.out.println("age is : " + age);
        }
        public void addAge(int i){      //age plus i
            age += i;   
        }
    }

public class Test {
    public static void main(String[] args) {
        Person job = new Person();
        job.name = "zhangsan";
        job.age = 20;
        job.sex = "男";
        job.study();
        job.showAge();
        System.out.println("after addAge(5) : ");
        job.addAge(5);
        job.showAge();
    }
}*/