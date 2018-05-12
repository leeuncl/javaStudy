import java.text.DecimalFormat;

public class Test {

final static double PI = 3.1415;

    static class Circle{
        public double radius;
        public String area() {
            DecimalFormat df = new DecimalFormat();
/*            double res = PI * radius * radius;*/
            /*return df.format(res);*/
            return df.format(PI * radius * radius);
        }
    }
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.radius = 5;
        System.out.println("半径为" + cir.radius + "的圆的面积为：" + cir.area());
    }
}