package notesjava;

import java.util.Scanner;

public class LiftProgram {
    public static void main (String[]args){
        int floor1st=0,floor2nd=5,floor3rd=6,floor4th=7;
        Scanner v2=new Scanner(System.in);
        while (true){
            System.out.println("Lift Elevator safe journey:");
            System.out.println("choose  1st floor (press botton): ");
            System.out.println(" choose  2nd floor (press botton): ");
            System.out.println("choose  3rd floor (press botton): ");
            System.out.println("choose  4th floor (press botton):  ");
            System.out.println("WELL COME ELEVATOR to select your destinaction the floor:");
            int choice = v2.nextInt();
            switch (choice){
                case 1:
                    System.out.println("open  doors");
                    floor1st= v2.nextInt();
                    System.out.println("running elevator");
                    if(floor1st==floor1st){
                        System.out.println("doors will be open 1st flore");
                    } else {
                        System.out.println("okay ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println(" open   doors");
                    floor2nd= v2.nextInt();
                    System.out.println("running elevator");
                    if(floor1st<=floor2nd){
                        System.out.println("doors will be open 2nd floor");
                    } else {
                        System.out.println("okay ");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(" open  doors");
                    floor3rd= v2.nextInt();
                    System.out.println("running elevator");
                    if(floor3rd==floor3rd){
                        System.out.println("doors will be open 3nd floor");
                    } else {
                        System.out.println("okay ");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(" open  doors");
                    floor4th= v2.nextInt();
                    System.out.println("running elevator");
                    if(floor4th==floor4th){

                        System.out.println("doors will be open 4th  floor");
                    } else {
                        System.out.println("your not selected floor select please ");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
