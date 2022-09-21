import java.util.Scanner;
public class P2 { 
    static void checkSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your salary: ");
        int salary = scanner.nextInt();
        System.out.print("What is your merit point: ");
        int merit = scanner.nextInt();
        char grade;

        if(salary >= 800){
            grade ='A';
        }else if(salary >= 700 && merit >=20){
            grade = 'A';
        }else if(salary >= 650){
            grade = 'B';
        }else if(salary >= 600 && merit >= 10){
            grade = 'B';
        }else{
            grade = 'C';
        }

        System.out.println("Your grade: " + grade);


    }
}
