package InnerClass.Anonymous;
public class Popcorn {
    public void taste()
    {
        System.out.println("spicy");
    }
    //100 more methods
    /*
    ;  ; ;; ;
     */
}
class SaltyPopcorn
{
    public static void main(String[] args) {
        Popcorn salty=new Popcorn()
        {
            @Override
            public void taste() {
                System.out.println("Salty");
            }
        };
    }
}
