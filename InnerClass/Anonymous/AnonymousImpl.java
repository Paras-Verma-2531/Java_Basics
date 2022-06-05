package InnerClass.Anonymous;
public class AnonymousImpl {
    public static void main(String[] args) {
        Popcorn pop = new Popcorn()// it's like  a class extended popcorn class
        {
            @Override
            public void taste() {
                System.out.println("salty taste");
            }
        };
        pop.taste();
    }
}
