package notesjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class   ArraysCollection {
    public static void main(String[]args){
//        HashSet<Integer> hh=new HashSet<>();
//        HashSet<String> vv=new HashSet<>();
//        hh.add(45);
//        hh.add(46);
//        hh.add(47);
//        hh.add(48);
//        hh.add(49);
//        vv.add("Praveen");
//        vv.add("Sathish");
//        vv.add("Prathap");
//        vv.add("Ravi");
//        System.out.println(hh);
//        System.out.println(vv);
//        Iterator<String> it=vv.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next()+"\t");
//        }
        ArrayList<String> ss=new ArrayList<>();
        ss.add("apple");
        ss.add("Banana");
        ss.add("Mango");
        ss.add("Pear");
        ss.add("Orange");
        String []rr=new String[ss.size()];
        for(int i=0;i<ss.size();i++){
            rr[i]=ss.get(i);
        }
        for(String s:rr){
            System.out.println(s);
        }
    }
}
