package Singleton;

public class SingletonImplementation {
    // Approach 1::
   private static SingletonImplementation instance= new SingletonImplementation();
    private SingletonImplementation()
    {}
    public static SingletonImplementation getInstance()
    {
        return instance;
    }
}
