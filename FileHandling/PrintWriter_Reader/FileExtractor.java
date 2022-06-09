package FileHandling.PrintWriter_Reader;

import OOPS.PACK2.B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileExtractor {
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("FileExtractor.txt");
        BufferedReader br= new BufferedReader(new FileReader("input.txt"));
        String Line1=br.readLine();
        while(Line1!=null)
        {
            boolean available=false;
            BufferedReader br1= new BufferedReader(new FileReader("delete.txt"));
            String target=br1.readLine();
            while(target!=null)
            {
                if(Line1.equals(target))
                {
                    available=true;
                    break;
                }
                target= br1.readLine();
            }
            if(available==false)
            {
                pw.println(Line1);
            }Line1=br.readLine();
            pw.flush();
        }
        System.out.println("file extracted successfully");
    }
}
