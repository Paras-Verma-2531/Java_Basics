package OOPS.Abstraction;

public  abstract class Shape {//Abstract class with abstract method
    public abstract void draw();
}
class Rectangle extends Shape// child class that provide implementation for draw method
{
    public void draw(){System.out.println("Rectangle is drawn");}
}
class Square extends Shape
{
    @Override
    public void draw() {System.out.println("Square is drawn");}
}
class Main
{
    public static void main(String[] args) {
        new Rectangle().draw();
        new Square().draw();// method calling
    }
}