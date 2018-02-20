package Practical_tasks;

/**
 * Created by Dell on 2/16/18.
 */
public class PT1_1SquareRoot {
    public static void main(String[] args) {
        //ax2 + bx + c = 0
        double a = -4;
        double b = 0;
        double c = -20;
        double d = Math.pow(b,2)-4*a*c;

        if (d>0) {
            System.out.println("x1="+(-b + Math.sqrt(d))/(2*a));
            System.out.println("x2="+(-b - Math.sqrt(d))/(2*a));
        }
        else {
            if (d<0) {
                System.out.println("x1=");
                System.out.println("x2=");
            }
            else {
                System.out.println("x1=" + (-b/(2*a)));
                System.out.println("x2=" + (-b/(2*a)));
            }
        }

    }
}
