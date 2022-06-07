package FileHandling.FileReader_Writer;

import java.io.FileWriter;
import java.io.IOException;

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
     3. write(String s);------> to write string data
     4. flush()--> it gives the guarantee that all the characters have been written to the file
     5. close()--> to close the writer
     */
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("abc.txt");
        fw.write(100);
        fw.write("efd\n");
        char[] ch={'a','b','c'};
        fw.write(ch);
        fw.close();

    }
}
