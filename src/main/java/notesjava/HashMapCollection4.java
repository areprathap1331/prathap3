package notesjava;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection4 {
    public static void main(String[]args){
        HashMap<Integer,String> ncl=new HashMap<>();
        ncl.put(11,"praveen");
        ncl.put(12,"sathish");
        ncl.put(13,"manju");
        ncl.put(14,"narahari");
        ncl.put(15,"mobin");
        System.out.println(ncl);
        System.out.println(ncl.size());
        System.out.println(ncl.isEmpty());
        System.out.println(ncl.replace(12,"anil sathish"));
        for (Map.Entry a:ncl.entrySet())
             {
                 System.out.println("key is :"+a.getKey());
                 System.out.println("value is:"+a.getValue());
        }

    }
}
