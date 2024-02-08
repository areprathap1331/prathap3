package notesjava;


import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashset {
    public static void main(String[]args){
        HashSet<String> b=new HashSet<String>();
        HashSet<Integer> b1=new HashSet<>();
        b.add("praveen");
        b.add("sathish");
        b.add("guptha");
        b.add("prathap");
        b.add("praveen");
        b.add(null);
        b1.add(13);
        b1.add(14);
        b1.add(15);
        b1.add(16);
        b1.add(17);
        b1.add(17);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b.isEmpty());
        System.out.println(b.size());
        System.out.println(b.contains("praveen"));
        System.out.println(b1.remove(4));
        Iterator<String> it = b.iterator();
        while(it.hasNext()){
            System.out.print(it.next() +"\t");
        }
    }
}
