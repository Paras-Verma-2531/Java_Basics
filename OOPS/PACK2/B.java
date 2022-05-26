package OOPS.PACK2;
import OOPS.PACK1.A;
public class B extends A {
    public static void main(String[] args) {
        B b=new B();
        b.m1();
        //A a= new A();
        //a.m1();  in different package for protected methods only child reference can be used
    }
}
