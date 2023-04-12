import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade:");

        grade = sc.nextInt();

        if (grade <60) {
            System.out.println("You got a F");
        }
        else if (grade >=60 & grade <70) {
            System.out.println("You got a D");
        }
        else if (grade >=70 & grade <80) {
            System.out.println("You got a C");
        }
        else if (grade >=80 & grade <90) {
            System.out.println("You got a B");
        }
        else if (grade >=90 & grade <=100) {
            System.out.println("You got a A");
        }
        else if (grade<0 & grade>100) {
            System.out.println("Score out of range");
        }
    }
}
