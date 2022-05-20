public class static_ex
{
 private int roll_no;
private String name;
private static String college_name="UPES";// static variable i,e variable having single copy for all objects
 static_ex(int roll_no,String name)
{
this.roll_no=roll_no;
this.name=name;
}
public void getDetails()
{
System.out.println("Name of student is " +name);
System.out.println("Roll no of student is " +roll_no);
System.out.println("College of student is " +college_name);
}
public static void main(String args[])
{
static_ex std=new static_ex(555,"paras");
std.getDetails();
}
}

