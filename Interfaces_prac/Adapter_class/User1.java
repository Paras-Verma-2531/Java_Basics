package Interfaces_prac.Adapter_class;

public class User1 extends AdapterClass{
    // since we only require feature 2 out of 7 methods:: here Adapter Classes becomes handy
    @Override
    public void feature2() {
        System.out.println("this is feature 2");
    }

    public static void main(String[] args) {
        User1 us1= new User1();
        us1.feature2();
    }
}
