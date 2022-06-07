package FileHandling;
public class FileWriter_impl {
    /*
    in order to write we can use FileWriter class:
    the constructor of the class are:[ if file is not present, these constructors will create new file]
    -----------------------------------
    -----------------------------------
    1.FileWriter fw= new FileWriter(String file name");
    -------------------[ it overrides the existing data in the file]----------[both 1,2]
     2.FileWriter fw= new FileWriter("File Reference");
     ----------- to append data ::
     3. FileWriter fw= new FileWriter(File name,boolean append)
     4.FileWriter fw= new FileWriter("File Reference",boolean append);
     -------------------------------------
     -------------------------------------
     Method present in FileWriter class:
     1. write(int ch);-------> A character
     2. write(char[] ch);-----> char array
     2. write(String s);------> to write string data
     */
}
