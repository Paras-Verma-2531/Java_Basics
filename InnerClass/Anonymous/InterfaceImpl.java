package InnerClass.Anonymous;
public class InterfaceImpl {
    // defining a thread by implementing runnable interface
    public static void main(String[] args) {
        /*Runnable rn = new Runnable() {
            public void run()
            {
                for(int i=0;i<10;i++)
                {
                    System.out.println("thread through runnable interface (Anonymous class)");
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e)
                    {
                        System.out.println(e);
                    }
                }
            }
            */
        // second approach of the same:-->::
        Thread th = new Thread(new Runnable() {
            public void run()
            {
                for(int i=0;i<10;i++)
                {
                    System.out.println("runnable interface-->Anonymous class");
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e)
                    {
                        System.out.println(e);
                    }
                }
            }
        });
         th.start();
    }
}
