package lab1;

import java.util.Scanner;

public class Grading {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");

        double grade = scanner.nextDouble();

        System.out.print("\n");

        if(grade <= 100 && grade >= 90)
            System.out.printf("Score: %f\tGrade: AA\tState: Passed", grade);
        else if(grade >= 85)
            System.out.printf("Score: %f\tGrade: AB\tState: Passed", grade);
        else if(grade >= 80)
            System.out.printf("Score: %f\tGrade: BA\tState: Passed", grade);
        else if(grade >= 75)
            System.out.printf("Score: %f\tGrade: BB\tState: Passed", grade);
        else if(grade >= 70)
            System.out.printf("Score: %f\tGrade: CB\tState: Passed", grade);
        else if(grade >= 65)
            System.out.printf("Score: %f\tGrade: CC\tState: Passed", grade);
        else if(grade >= 60)
            System.out.printf("Score: %f\tGrade: DC\tState: Passed", grade);
        else if(grade >= 50)
            System.out.printf("Score: %f\tGrade: DD\tState: Passed", grade);
        else if(grade >= 0)
            System.out.printf("Score: %f\tGrade: FF\tState: Failed", grade);
        else
            System.out.println("Invalid input!");
    }
}
