package notesjava;

public interface  interfaceProgram {
    void s();
}
interface NCL{
    void h();
}
interface WCL{
    void a();
    void b();
}
class prathap6 implements interfaceProgram ,NCL,WCL{
    public void s(){
        System.out.println("interface");
    }
    public void h(){
        System.out.println("with");
    }
    public void a(){
        System.out.println("addition");
    }
    public void b(){
        System.out.println("haaa");
    }
    public static void main(String[]args){
        prathap6 v1=new prathap6();
        v1.s();
        v1.h();
        v1.a();
        v1.b();
    }
}


