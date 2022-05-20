class static_variable_ex
{
private static int x=5;
private int y;

static_variable_ex(int num)
{
this.y=num;
}
public void getDetails()
{
System.out.println("x is " +x + " y is " +y);
}
public static void main(String args[])
{
static_variable_ex var= new static_variable_ex(34);
var.getDetails();
var.x=100;// value of static variable is now changed for all objects
static_variable_ex var1= new static_variable_ex(35);
var1.getDetails();
}
}
