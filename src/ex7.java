import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        String status;
        int income;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your filing status:");
        status = sc.nextLine();

        System.out.println("Enter your income:");
        income = sc.nextInt();

        if (status.equals("Single")){
            if(income< 8350){
                System.out.println("You are taxed 10%");
            }
            else if(income>= 8351 && income<=33950){
                System.out.println("You are taxed 15%");
            }
            else if(income>= 33951 && income<=82250){
                System.out.println("You are taxed 25%");
            }
            else if(income>= 82251 && income<=171550){
                System.out.println("You are taxed 28%");
            }
            else if(income>= 171551 && income<=372950){
                System.out.println("You are taxed 33%");
            }
            else if(income>= 372951){
                System.out.println("You are taxed 35%");
            }
        }
        else if (status.equals("Married Filing Jointly")) {
            if(income< 16700){
                System.out.println("You are taxed 10%");
            }
            else if(income>= 16701 && income<=67900){
                System.out.println("You are taxed 15%");
            }
            else if(income>= 67901 && income<=137050){
                System.out.println("You are taxed 25%");
            }
            else if(income>= 137051 && income<=208850){
                System.out.println("You are taxed 28%");
            }
            else if(income>= 208851 && income<=372950){
                System.out.println("You are taxed 33%");
            }
            else if(income>= 372951){
                System.out.println("You are taxed 35%");
            }
        }
        else if (status.equals("Married Filing Separately")){
            if(income< 8350){
                System.out.println("You are taxed 10%");
            }
            else if(income>= 8351 && income<=33950){
                System.out.println("You are taxed 15%");
            }
            else if(income>= 33951 && income<=68525){
                System.out.println("You are taxed 25%");
            }
            else if(income>= 68526 && income<=104425){
                System.out.println("You are taxed 28%");
            }
            else if(income>= 104426 && income<=186475){
                System.out.println("You are taxed 33%");
            }
            else if(income>= 186476){
                System.out.println("You are taxed 35%");
            }
        }
        else if (status.equals("Head of Household")){
            if(income< 11950){
                System.out.println("You are taxed 10%");
            }
            else if(income>= 11951 && income<=45500){
                System.out.println("You are taxed 15%");
            }
            else if(income>= 45501 && income<=117450){
                System.out.println("You are taxed 25%");
            }
            else if(income>= 117451 && income<=190200){
                System.out.println("You are taxed 28%");
            }
            else if(income>= 190201 && income<=372950){
                System.out.println("You are taxed 33%");
            }
            else if(income>= 372951){
                System.out.println("You are taxed 35%");
            }
        }
        else {
            System.out.println("Error, please enter a correct filing status!");
        }
    }
}
