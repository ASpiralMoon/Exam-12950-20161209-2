package exam;

import java.util.Scanner;

/**
 * Created by ASpiralMoon on 2016/12/9.
 */
public class Exam2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入工资: ");
        while (sc.hasNextDouble()) {
            double d = sc.nextDouble();
            System.out.println("所需缴纳的税费为: " + exam(d));
        }
    }

    public static double exam(double d) {

        double s = d - 3500;
        if (s <= 0) {
            s = 0;
        } else if (s <= 1500) {
            s = s * 0.03;
        } else if (s > 1500 && s <= 4500) {
            s = (s - 1500) * 0.1 + 45;
        } else if (s > 4500 && s <= 9000) {
            s = (s - 4500) * 0.2 + 345;
        } else if (s > 9000 && s <= 35000) {
            s = (s - 9000) * 0.25 + 1245;
        } else if (s > 35000 && s <= 55000) {
            s = (s - 35000) * 0.3 + 7745;
        } else if (s > 55000 && s <= 80000) {
            s = (s - 55000) * 0.35 + 13745;
        } else if (s > 80000) {
            s = (s - 80000) * 0.45 + 22495;
        }

        return s;
    }
}
