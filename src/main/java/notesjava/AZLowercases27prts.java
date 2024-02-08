
package notesjava;
import java.util.Scanner;

public class AZLowercases27prts {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter a charactars");
        char v= a.next().charAt(0);
        if (v >='A'&&v<='Z') {
            System.out.println("uppers case");
        }
        else if (v >='a'&&v<='z')
        {
            System.out.println("lower case");
        }

    }
}