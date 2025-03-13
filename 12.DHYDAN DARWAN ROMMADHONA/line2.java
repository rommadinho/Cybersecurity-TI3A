import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;
 
public class line2
{
   public static void main(String[] args) throws IOException
   {
    try
     {
        int desimal;
        char ascii;
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("output.txt"));
        while ((desimal = lineNumberReader.read()) != -1) 
        {
            ascii = (char) desimal;
            System.out.println("" + ascii + " at line " + lineNumberReader.getLineNumber());
        }
    } 
    catch (FileNotFoundException ex)
    {
     System.out.print("");
    }
   }
}