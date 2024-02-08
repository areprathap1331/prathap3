package notesjava;

import com.sun.xml.internal.org.jvnet.mimepull.DecodingException;

public class exceptionHAN {
    public static void main(String[]args){
        int []t={1,2,3,4,5};
        try{
            System.out.println(t[5]);
        } catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(ClassCastException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(StackOverflowError e){
            System.out.println(e);
            e.printStackTrace();
        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("hello" );
//        int a=10,b=16;
//        if(a<b){
//            try{
//                System.out.println("no");
//            }catch (Exception e){
//                System.out.println(e);
//                e.printStackTrace();
//            }
//        }
    }
}
