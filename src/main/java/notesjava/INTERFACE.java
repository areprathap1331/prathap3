package notesjava;

public class INTERFACE {

//    void p(){
//        System.out.println("Vamshi ");
//    }
//    void r() {
//        System.out.println("Riyaz");
//    }
//    void a(){
//        System.out.println("Lohith");
//    }
//    void t(){
//        System.out.println("Prathap");
//    }
//    public static void main(String []args){
//        INTERFACE h2= new INTERFACE();
//        h2.p();
//        h2.r();
//        h2.a();
//        h2.t();
//    }
    void pk(){
        System.out.println("inharitance program");
    }
}
class vamshi extends INTERFACE{
    void pr(){
        System.out.println("interface ");
    }
}
class riyaz extends vamshi{
    void pl(){
        System.out.println("multi Level interface");
    }
}
class Lohoth extends riyaz{
    void ph(){
        System.out.println("hello");
    }
    Lohoth(){
        System.out.println("constructor");
    }
    public static void main (String []args){
        Lohoth m1=new Lohoth();
        m1.pk();
        m1.pr();
        m1.pl();
        m1.ph();
    }
}

