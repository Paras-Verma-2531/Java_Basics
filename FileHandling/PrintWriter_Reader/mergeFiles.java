package FileHandling.PrintWriter_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class mergeFiles {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("abc1.txt"));
        PrintWriter pr= new PrintWriter("mergeFile.txt");
        String Line1=br.readLine();
        String Line2=br1.readLine();
        while(Line1!=null||Line2!=null)
        {
            if(Line1!=null)
            {
                pr.println(Line1);
                Line1=br.readLine();
            }
            if(Line2!=null)
            {
                pr.println(Line2);
                Line2=br1.readLine();
            }
        }pr.flush();
        br.close();
        br1.close();
        pr.close();
        System.out.println("file successfully merged");

    }
}
