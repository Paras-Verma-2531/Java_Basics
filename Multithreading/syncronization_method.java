package Multithreading;
class Greeting
{
    public void wish(String name)
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("hello "+name);
        }
    }
}
class syncronization_method extends Thread{
    Greeting gr;String name;
    syncronization_method(Greeting gr,String name)
    {
        this.gr=gr;this.name=name;
    }
    public void run()
    {
        gr.wish(name);
    }
}
class SynchronizationDemo
{
    public static void main(String[] args) {
        Greeting gr= new Greeting();
        syncronization_method syn=new syncronization_method(gr,"Dhoni");
        syncronization_method sy1=new syncronization_method(gr,"yuvraj");
        new syncronization_method(gr,"kohli").start();
        new syncronization_method(gr,"raina").start();
        syn.start();//since there is only one thread is accessing object , it will run perfectly [no synchronization required]
        sy1.start();// now 2 threads accessing same object
        //since multiple threads are accessing the same java object hence syncro is required:

    }
}

