package assignments.lab;

import java.util.Scanner;
import java.lang.Math;
public class lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, sol1, sol2;
        System.out.println("Enter the coefficients of your equation (a, b, c)");
        System.out.printf("Enter a:");
        a = scanner.nextDouble();
        System.out.printf("Enter b:");
        b = scanner.nextDouble();
        System.out.printf("Enter c:");
        c = scanner.nextDouble();
        scanner.close();
        d = (b * b) - (4 * a * c);

        if(d > 0){
            sol1 = (-b + Math.sqrt(d)) / 2 * a;
            sol2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.printf("%.0fx^2 + %.0fx + %.0f = 0\n The discriminant of this equation is positive so it has two real roots.\nFirst root = %.0f\nSecond root = %.0f", a, b, c, sol1, sol2);
        }
        else if(d < 0){
            sol1 = (-b + Math.sqrt(d)) / 2 * a;
            sol2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.printf("%.0fx^2 + %.0fx + %.0f = 0\n The discriminant of this equation is negative so it has no real roots.", a, b, c);
        }
        else{
            sol1 = (-b / (2 * a));
            System.out.printf("%.0fx^2 + %.0fx + %.0f = 0\n The discriminant of this equation is zero so it has one real root.\nRoot = %.0f", a, b, c, sol1);
        }
    }    
}
