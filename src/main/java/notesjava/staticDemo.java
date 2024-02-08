package notesjava;
public class staticDemo {
    static int x = 10;
    int y = 15;

    static void prathap() {
        System.out.println("praveen");
    }

    static {
        System.out.println("praveen\t" + "prathap");
    }
}
    class  b {
        public static void main(String[] args) {
            int z = 50;
            System.out.println(z);
            staticDemo v = new staticDemo();
            System.out.println(v.y);
            System.out.println(staticDemo.x);
            staticDemo.prathap();
        }
    }