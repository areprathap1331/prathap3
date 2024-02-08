package notesjava;

public class CharToStringConvert {
    public static void main(String[]args){
        String p="prathap";
        String[]v=p.split( "");
        for(int i= v.length-1;i>=0;i--) {
            System.out.println(v[i]);
        }
        char ch[]={'p','r','a','t','h','a','p'};
        String b= new String(ch);
        System.out.println(b);

    }

}
