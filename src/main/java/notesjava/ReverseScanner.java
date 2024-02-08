package notesjava;

import java.util.Scanner;

import static notesjava.enyvalueREVERCE.reverseNumber;

public class ReverseScanner {
    public static void main(String[]args){
        Scanner nn =new Scanner(System.in);
        System.out.println("enter the numbers :  ");
        int pp=nn.nextInt();
        int reverse_number = reverseNumber(pp);
        System.out.println("reverse given value: ="+reverse_number);
    }
}
