package GenericTypes;

public class GenericExample<T> {
    private T ob;
    public  GenericExample(T ob)
    {
        this.ob=ob;
    }
    public void show()
    {
        System.out.println("the type of ob is "+ob.getClass().getName());
    }
    public T getOb()
    {
        return ob;
    }
}
