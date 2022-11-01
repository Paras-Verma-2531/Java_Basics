package InnerClass;
/*
Any named Inner class which is not static and is directly inside another class is known as Regular/Normal Inner Class.
 */
public class NormalRegular {
    int x=10;// default non-static member of outer class
    static int y=20;
     class Inner
    {// from normal/regular inner class we can access all the members(static/non-static) of outer class directly.
        public void m1()
        {
            System.out.println(x);
            System.out.println(y);
        }
        /*
        public static void main(String[] args) {
        System.out.println("Inside inner class main method");
        }
        ========================
        This will give error because we cannot have static declarations.[ because without the existence of outer class object
        inner classes does not have existence therefore to fulfill such [[ static declarations are not allowed]]
        ]
     */
    }
    public static void main(String[] args) {
         /*
         =================
         How to call m1 method of inner class
         ---since inner class need outer class object for its creation therefore we need to create outer obj first

          */
      NormalRegular ob1= new NormalRegular();
      NormalRegular.Inner inner= ob1.new Inner();
      inner.m1();
      //3 Line for method calling
      NormalRegular.Inner in=new NormalRegular().new Inner();
      in.m1();
      /*
      Also does the same thing [ combined first 2 lines]
       */
      new NormalRegular().new Inner().m1();
      /*
      does the same work as above [[ but shorthand notation]
      combined 3 Line
       */
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
