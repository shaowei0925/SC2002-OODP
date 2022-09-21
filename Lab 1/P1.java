import java.util.Scanner;

public class P1 {
    
    static void movieFan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String word = scanner.nextLine();
        switch(word.charAt(0)){
            case 'a': 
            case 'A': 
            System.out.println("Action movie fan");
            break;

            case 'c':
            case 'C':
            System.out.println("Comedy movie fan");
            break;

            case 'd':        
            case 'D':
            System.out.println("Drama movie fan");
            break;

            default:
            System.out.println("Invalid choice");
        };
    }


}
