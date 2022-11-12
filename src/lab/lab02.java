import java.util.Scanner;
import java.lang.Math;

public class lab02 {

public static boolean isTriangle(double a, double b, double c) {
    if(Math.abs(b - c) < a && Math.abs(b+c) > a && Math.abs(a - c) < b && Math.abs(a+c) > b && Math.abs(a - b) < c && Math.abs(a+b) > c) 
        return true;
    else return false;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 3 sides to check if it is a triangle:");
    double area, s1 = scanner.nextDouble(), s2 = scanner.nextDouble(), s3 = scanner.nextDouble(), p = (s1 + s2 + s3) / 2;
    scanner.close();
    area = Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    if(isTriangle(s1, s2, s3)){
        System.out.printf("The triangle which has sides %.1f, %.1f and %.1f has area of %.1f", s1, s2, s3, area);
    }
    else 
        System.out.printf("There is no such triangle which has sides %.1f, %.1f and %.1f", s1, s2, s3);
    } 
}
