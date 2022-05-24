package ExceptionHandling.CustomisedException;

public class InputAge {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age<0)
        {
            throw  new InvalidAge("enter the valid age");
        }
        else if(age>60)
        {
            throw  new TooOldAge("your are too old to marriage better luck next time");
        }
        else if(age<21)
        {
            throw  new TooYoungAge("you are too young to get marriage");
        }
        else
        {
            System.out.println("soon you will find your soulmate");
        }
    }
}
