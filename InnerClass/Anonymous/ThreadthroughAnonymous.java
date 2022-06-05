package InnerClass.Anonymous;

public class ThreadthroughAnonymous {
    /*in normal approach we have to create another class which extends thread class
     and then the main class
     */
    public static void main(String[] args) {
        Thread th = new Thread()
        {
            public void run()
            {
                for(int i=0;i<100;i++)
                {
                    System.out.println("thread through anonymous");
                    try
                    {
                        Thread.sleep(3000);
                    }catch (InterruptedException e)
                    {
                        System.out.println(e);
                    }
                }
            }
        };
        th.start();
    }
}
