package notesjava;

import java.util.ArrayList;

public class CollectionProgram {
//    Integer i=3;
//    Character v='p';
//    Float t=1.5f;
//    int x=i.intValue();
//    char y=v.charValue();
//    float z=t.floatValue();
    public static void main(String[]args){
//        CollectionProgram v1=new CollectionProgram();
//        System.out.println(v1.i);
//        System.out.println(v1.v);
//        System.out.println(v1.t);
//        System.out.println("collection program over");
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Character> p1=new ArrayList<>();
        p.add(13);
        p.add(14);
        p.add(15);
        p.add(16);
        p.add(17);
        p1.add('p');
        p1.add('r');
        p1.add('a');
        p1.add('v');
        System.out.println(p);
        System.out.println(p1.indexOf('r'));
        System.out.println(p1.remove(0));
        System.out.println(p.lastIndexOf(16));
    }
}
