package Singleton;
public class Singleton_main {
    public static void main(String[] args) {
        SingletonImplementation instance= SingletonImplementation.getInstance();// 1st object created
        SingletonImplementation instance1= SingletonImplementation.getInstance();// uses same reference
        System.out.println(instance.toString());
        System.out.println(instance1.toString());//same reference


    }
}
