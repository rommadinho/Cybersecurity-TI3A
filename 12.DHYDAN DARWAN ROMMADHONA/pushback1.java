import java.io.*;
import java.io.PushbackInputStream;


public class pushback1 {
    public static void main (String args [])
    {
        PushbackInputStream stream = new PushbackInputStream(System.in);
        System.out.print("Masukan karakter apapun: ");
    try {
        int read = stream.read();
       // stream.unread(read);
        int read2 = stream.read();
        System.out.print("" + (char) read);
        System.out.print("" + (char) read2);
    } catch (IOException ex) 
    {
       // Logger.getLogger(pushb.class.getName()).log(Level.SEVERE, null, ex);
       System.out.println();

    }

    }
    
    
    
}
