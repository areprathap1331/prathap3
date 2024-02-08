package notesjava;

import java.util.Scanner;

public class TablesProgram {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int v=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(v+"*"+i+"="+v*i); 

        }

    }
}
