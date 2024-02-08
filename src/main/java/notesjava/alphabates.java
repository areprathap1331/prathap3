
package notesjava;
public class alphabates {
    public static void main(String[]args) {

        String b = "HyDEraBaDh";
        for(int i=0;i<b.length();i++){
            char  v=b.charAt(i);
            if(v>='A'&&v<='Z'){
                System.out.println("upper cacses letters="+v);
            }
            else if (v>='a'&&v<='z'){
                System.out.println("lower cases letters="+v);
            }
        }
    }
}
