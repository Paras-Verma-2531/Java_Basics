package InnerClass;
public class normalRegular {
    int x=10;
    static int y=20;
    public class inner
    {// from normal/regular inner class we can access all the members(static/non-static) of outer class directly.
        public void m1()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    public static void main(String[] args) {
        new normalRegular().new inner().m1();
    }
}
/*
class Outer
{
  int x=10;
  class inner
  {
  int x=100;
  public void m1()
  {
  int x=1000;
  sopln(x);--->1000
  sopln(this.x)--->100
  sopln(outer.this.x)--->10
  }
  }
  psvm(String args[])
  {
  new outer(). new inner().m1();
  }
  }
 */
