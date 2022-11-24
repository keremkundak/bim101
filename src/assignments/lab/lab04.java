package assignments.lab;

import java.util.Random;
import java.util.Scanner;

public class lab04 {
    public static int bruteForceGDC(int a, int b) {
        int gdc = 1, i, min;

        if(a < b) {
            min = a;
        }
        else {
            min = b;
        }

        for(i = 1; i < min; i++) {
            if(a % i == 0 && b % i == 0)
                gdc = i;
            else
                continue;
        }
        return gdc;
    }

    public static int euclideanGDC(int a, int b) {
        int k, temp;

        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        
        k = a % b;
        while(k != 0) {
            a = b;
            b = k;
            k = a % b;
        }
        return b;        
    }

    public static void randGDC(){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int choice, a = (rand.nextInt(1000)) + 1, b = (rand.nextInt(1000) + 1);
        
        System.out.printf("Calculate %d and %d's greatest common divisor with:\n1 - Brute force algorithm\n2 - Euclidean algorithm\n", a, b);
        choice = scanner.nextInt();
        scanner.close();

        switch(choice){
            case 1:
                System.out.printf("Greatest common divisor of %d and %d calculated with Brute Force Algorithm is %d", a, b, bruteForceGDC(a, b));
            break;
            case 2:
                System.out.printf("Greatest common divisor of %d and %d calculated with Euclidean Algorithm is %d", a, b, euclideanGDC(a, b));    
            break;
            default:
                System.out.println("Error!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, choice;
        System.out.println("Enter two numbers to find their greatest common divisor: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.printf("Choose the algorithm:\n1 - Brute force algorithm\n2 - Euclidean algorithm\n3 - Use two randomly generated numbers\n");
        choice = scanner.nextInt();


        switch(choice){
            case 1:
                System.out.printf("Greatest common divisor of %d and %d calculated with Brute Force Algorithm is %d", a, b, bruteForceGDC(a, b));
                break;
            case 2:
                System.out.printf("Greatest common divisor of %d and %d calculated with Euclidean Algorithm is %d", a, b, euclideanGDC(a, b));    
                break;
            case 3:
                randGDC();
                break;    
            default:
                System.out.println("Error!!");
            }
        scanner.close();
    }
}
