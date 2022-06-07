package FileHandling.FileReader_Writer;
public class Filereader {
    /*
    we  can use fileReader to read character data from the file.
    -----------------------------
    constructors used in FileReader class::
    1.FileReader fr= new FileReader(String fname);
    2.FileReader fr= new FileReader(file reference);
    --------------------------
    --------------------------
    methods use in FileReader class::
    1. read()--> reads character by character[ return type is int](unicode value)
    2.int read(char[] ch)---> to read char array[ it returns no of character copied from file to array]
    ex:: FileReader fr= new FileReader("abc.txt");
    char[] ch= new char[10000];
    let assume abc has 1000 characters
    int size=fr.read(ch);
    here, size is 1000.
-----------------------------------------------
3. close()---> to close the file::
     */
}
