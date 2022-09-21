import java.util.Scanner;
import java.lang.Math;
public class Lab2p1 {
 public static void main(String[] args)
 {
    int choice;
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("Perform the following methods:");
        System.out.println("1: multiplication test");
        System.out.println("2: quotient using division by subtraction");
        System.out.println("3: remainder using division by subtraction");
        System.out.println("4: count the number of digits");
        System.out.println("5: position of a digit");
        System.out.println("6: extract all odd digits");
        System.out.println("7: quit");
        choice = sc.nextInt();
        int m, n;
        switch (choice) {
            case 1: /* add mulTest() call */ mulTest();
            break;
            case 2: /* add divide() call */ 
                System.out.print("m: ");
                m = sc.nextInt();
                System.out.print("n: ");
                n = sc.nextInt();
                System.out.println(m+"/"+n+" = "+divide(m,n));
            break;
            case 3: /* add modulus() call */
                System.out.print("m: ");
                m = sc.nextInt();
                System.out.print("n: ");
                n = sc.nextInt();
                System.out.println( m+"%"+n+" = "+modulus(m,n));
            break;
            case 4: /* add countDigits() call */
                System.out.print("n: ");
                n = sc.nextInt();
                if(countDigits(n)!= -1){
                    System.out.println("Counts = " + countDigits(n));
                }else{
                    System.out.println("Error Input !!");
                }
                
            break;
            case 5: /* add position() call */
                int digit;
                System.out.print("n: ");
                n = sc.nextInt();
                System.out.print("Digit: ");
                digit = sc.nextInt();
                System.out.println("Position = "+ position(n, digit));
            break;
            case 6: /* add extractOddDigits() call */
                Long number;
                System.out.print("Number: ");
                number = sc.nextLong();
                if(extractOddDigits(number) == -1){
                    System.out.println("Error Input!!");
                }else{
                    System.out.println("oddDigits = "+ extractOddDigits(number));
                }
            break; 
            case 7: System.out.println("Program terminating …");
        }
    } while (choice < 7);
    }
 /* add method code here */
    public static void mulTest(){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        int total = 0;
        for(int i=0; i<5; i++){
            n1 = (int)(Math.random()*10);
            n2 = (int)(Math.random()*10);
            int res = n1*n2;
            System.out.print("How much is "+ n1 + " times "+ n2+": ");
            int ans = sc.nextInt();
            if(ans == res){
                total += 1;
            }
            System.out.println();
        }
        System.out.println(total + " answers out of 5 are correct");
    };

    public static int divide(int m, int n){
        int res = 0;
        while(m-n >=0 ){
            res += 1;
            m -= n;
        };
        return res;
    };

    public static int modulus(int m, int n){
        while(m-n >=0){
            m -= n;
        }
        return m;
    }
    public static int countDigits(int n){
        int res = 0;
        if(n<0){
            return -1;
        }
        while(n != 0){
            res += 1;
            n /= 10;
        }
        return res;
    };
    public static int position(int n, int digit){
        int res = -1;
        String s = String.valueOf(n);
        for (int i =0; i<s.length(); i++){
            if(s.charAt(i)-'0' == digit){
                res = i;
            }
        }
        if(res == -1){
            return res;
        }
        return s.length()-res;
    }

    public static long extractOddDigits(long n){
        if(n<0){
            return -1;
        }
        String word = "";
        String s = String.valueOf(n);
        for(int i=0; i< s.length(); i++){
            int index = s.charAt(i)-'0';
            if(index % 2 ==1){
                word += s.charAt(i);
            }
        }
        if(word == ""){
            return -1;
        }
        long res = Long.parseLong(word);
        return res;
    }
}