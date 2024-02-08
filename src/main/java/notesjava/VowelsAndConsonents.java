package notesjava;

public class VowelsAndConsonents {
//    public static void main(String[]args){
//        String AP="ARE PRATHAP";
//        for(int i=0;i<AP.length();i++){
//            char c =AP.charAt(i);
//            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
//                    c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
//                System.out.println("Vowels:"+c);
//            }else {
//                System.out.println("consonents:"+c);
//            }
//            }
//    }
    public  static void main(String[]args){
        String s=" ARE PRATHAP PATEL";
        for (int i=0;i<s.length();i++){
            char r=s.charAt(i);
            if(r=='A'||r=='E'||r=='I'||r=='O'||r=='U'||
                            r=='a'||r=='e'||r=='i'||r=='o'||r=='u') {
                System.out.println("Vowels:" + r);
            } else{
                System.out.println("Consonents:"+r);
            }

        }
    }
}
