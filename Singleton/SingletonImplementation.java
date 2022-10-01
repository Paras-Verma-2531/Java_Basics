package Singleton;
public class SingletonImplementation {
    // Approach 1::
    /*
    Create an object at the beginning and return the reference to it everytime
    this is wastage of memory [because we are creating an object if user doesn't want]
   private static SingletonImplementation instance= new SingletonImplementation();
    private SingletonImplementation()
    {}
    public static SingletonImplementation getInstance()
    {
        return instance;
    }
    */
    //Approach 2::
    private static SingletonImplementation instance =null;
    // no wastage of object at the beginning
    private SingletonImplementation()
    {}
    public static SingletonImplementation getInstance()
    {
        if(instance==null) {
            instance = new SingletonImplementation();
        }return instance;
    }
}
