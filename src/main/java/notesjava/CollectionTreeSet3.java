package notesjava;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSet3 {
    public static void main(String[]args){
        TreeSet<String> v=new TreeSet<>();
        v.add("pra");
        v.add("thap");
        v.add("sathish");
        v.add("guptha");
        v.add("manju");
        v.add("manju");
        System.out.println(v);
        System.out.println(v.isEmpty());
        System.out.println(v.size());
        System.out.println(v.remove("manju"));
        Iterator<String> v1=v.iterator();
        while (v1.hasNext()){
            System.out.print(v1.next() +"\t");
        }

    }
}
