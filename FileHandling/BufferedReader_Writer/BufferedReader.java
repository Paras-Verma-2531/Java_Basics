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
     */
}
