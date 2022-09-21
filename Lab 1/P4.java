import java.security.KeyStore.LoadStoreParameter;
import java.util.Scanner;

public class P4 {
    
    static void pattern(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();
        int i = 1 ; 
        boolean swap = true;
        char letter = 'A';
        while (i <= height){
            if(i%2 == 1){
                letter = 'A';
                swap = true;
            }else{
                letter = 'B';
                swap = false;
            };
            int n = 0;
            for(int j=0; j<2*i; j++){
                if(swap){
                    letter ='A';
                }else{
                    letter = 'B';
                }
                System.out.print(letter);
                n += 1;
                if(n == 2){
                    swap = !swap;
                    n = 0;
                }
            }
            System.out.println();
            i += 1;
        } 
    }
}
