import java.util.Arrays;
import java.util.Scanner;
public class P3 {
    static int[] ask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Starting value: ");
        int start = scanner.nextInt();
        System.out.print("Ending value: ");
        int end = scanner.nextInt();
        System.out.print("Increment: ");
        int increment = scanner.nextInt();
        if(start > increment){
            System.out.println("Error Input!!");
            int[] error ={0};
            return error;
        };
        int[] arr = {start,end,increment};
        return arr;
    }

    static void title(){
        System.out.println("US$             S$");
        System.out.println("------------------");
    }

    static void usToSg1(){
        int arr[] = ask();
        if(arr.length == 1){
            return;
        }
        title();
        for(int i = arr[0]; i<= arr[1]; i+= arr[2]){
            double s = i*1.82;
            System.out.println(i+"              "+s);
        }
        
    };
    static void usToSg2(){
        int arr[] = ask();
        if(arr.length == 1){
            return;
        }
        int i = arr[0];
        title();
        while(i <= arr[1]){
            double s = i*1.82;
            System.out.println(i+"              "+s);   
            i += arr[2]; 
        }
    };
    static void usToSg3(){
        int arr[] = ask();
        if(arr.length == 1){
            return;
        }
        int i = arr[0];
        title();
        do{
            double s = i*1.82;
            System.out.println(i+"              "+s);   
            i += arr[2]; 
        }while(i <= arr[1]);
    };
}
