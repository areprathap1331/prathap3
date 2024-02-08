package notesjava;

abstract class ABSTRACT {
    abstract void k();
}
abstract class vv extends ABSTRACT{
    void k(){
        System.out.println("Abstract program");
    }
    abstract void kk();
}
abstract class vvv extends vv{
    void kk(){
        System.out.println("method Overriding");
    }
    abstract void kkk();
}
class pratha extends vvv{
    void kkk(){
        System.out.println("phalimorfisam");
    }
    public static void main(String[]args){
        pratha m2=new pratha();
        m2.k();
        m2.kk();
        m2.kkk();
    }
}
