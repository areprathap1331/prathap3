package notesjava;

public class HYDERABADH {
    //Dublicate values Program//
//    public static void main(String[]args){
//        String a="prathap are";
//        char []m=a.toCharArray();
//        for(int t=0;t<a.length();t++){
//            for(int u=t+1;u<a.length();u++){
//                if(m[t]==m[u]){
//                    System.out.println(m[u]);
//                }
//            }
//        }
//    }
    public static void main(String[]args){
        String r="NIZAMABAD";
        for(int i=0;i<r.length();i++){
            char a=r.charAt(i);
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                System.out.println("vowels:"+a);
            } else {
                System.out.println("Consonents:"+a);
            }
        }

    }
}
