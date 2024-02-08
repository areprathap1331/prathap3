package notesjava;
public class charectorsalphabets {
    public static void main(String[] args) {
        String a = "ADFsdfrtADDFSS";
        System.out.println("upper cases");
//        char c[]=a.toCharArray();
//        for (char b : c) {
//            System.out.println(b);
//        }
//        String[] sss = a.split(" ");
//        for (String sa : sss) {
//            System.out.println(sa);
//        }
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c>='A'&&c<='Z'){
                System.out.println(c);
            }
        }
        System.out.println("lowwer cases");
        for(int i=0;i<a.length();i++){
            char v=a.charAt(i);
            if(v>='a'&&v<='z'){
                System.out.println(v);
            }
        }
    }
}
