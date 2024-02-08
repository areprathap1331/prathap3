package notesjava;


import java.util.ArrayList;
import java.util.List;

public class Collections1 {
    public static void main(String[]args){
        List<Integer> v1=new ArrayList<>();
        ArrayList<Integer> v2=new ArrayList<>();
        ArrayList<Character> v3=new ArrayList<>();
        v2.add(45);
        v2.add(34);
        v2.add(67);
        v2.add(45);
        v3.add('p');
        v3.add('r');
        v3.add('a');
        v3.add('t');
        v3.add('h');
        v3.add('a');
        v3.add('p');
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v3.add('a'));
        System.out.println(v3.indexOf('p'));
        System.out.println(v3.contains(8));
        System.out.println(v2.contains(4));
        System.out.println(v3.get(4));
        System.out.println(v2.lastIndexOf(45));
        System.out.println(v3.remove(6));
    }
}
