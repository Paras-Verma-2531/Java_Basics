package Collections;
import java.util.Comparator;
import java.util.TreeSet;
class Student
{
    int marks;String name;
    public Student(String name,int marks)
    {
        this.name=name;this.marks=marks;
    }
}
public class TreeSet_Sorting {
    /*
    TreeSet contains Students in non-increasing order
    which is not the natural order Sorting ---> thus achieved by Comparator

     */
    public static void main(String[] args) {
        TreeSet<Student>tr=new TreeSet <>(new Comparator <Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.marks>o2.marks)return -1;
                if(o1.marks<o2.marks)return 1;
                return 0;
            }
        });
        Student st1=new Student("paras",78);
        Student st2=new Student("Akshita",79);
        Student st3=new Student("Aparna",77);
        Student st4=new Student("Harsh",76);
        Student st5=new Student("Palash",80);
        tr.add(st1);
        tr.add(st2);
        tr.add(st3);
        tr.add(st4);
        tr.add(st5);
        for(Student str:tr)
            System.out.println("Name of the Student is "+str.name+" and his/her marks are "+str.marks);
    }
}
