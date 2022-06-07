package FileHandling.BufferedReader_Writer;
public class BufferedReader {
    /*
    whenever we are required to read data line by line, it is recommended to use BufferedReader.
    FileReader is not recommended at all.
    we can use bufferedWriter to write character data to the file.
    --------------------------
    Constructors::
    (BufferedWriter cannot communicate directly to the file:: therefore requires some writer object)
    BufferedWriter bw= new BufferedWriter(writer w);
    BufferedWriter bw= new BufferedWriter(writer w, int buffersize);
    --------------------
    Two level Buffering
    ----------------
    BufferedWriter bw=new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt")));
    ------------
    -----------
    methods used in BufferedWriter
     1. write(int ch);-------> A character
     2. write(char[] ch);-----> char array
     3. write(String s);------> to write string data
     4. flush()--> it gives the guarantee that all the characters have been written to the file
     5. close()--> to close the writer
     6. newLine()---->uses new line separator
     */
}
