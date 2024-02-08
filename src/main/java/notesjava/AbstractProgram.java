package notesjava;

abstract class AbstractProgram {
    void x(){
        System.out.println("concrate method ");
    }
    abstract void y();
}
 abstract class pra extends  AbstractProgram{
    void y(){
        System.out.println("abstract method ");
    }
    abstract void z();
}
abstract class NCL2 extends pra{
    void z(){
        System.out.println("prathap");
    }
    abstract void A();
}
class VKL extends NCL2{
    void A (){
        System.out.println("Abstract class method");
    }
    public static void main(String[]args){
        VKL v3=new VKL();
        v3.x();
        v3.y();
        v3.z();
        v3.A();
    }
}
