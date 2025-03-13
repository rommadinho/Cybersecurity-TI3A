import java.io.FileInputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;

public class line1
{
   public static void main(String[] args) throws IOException 
   {
      
      LineNumberInputStream lnis = null;
      FileInputStream fis =null;
      int i;
      char c;
      
      try{
         fis = new FileInputStream("output.txt");
         lnis = new LineNumberInputStream(fis);
         
         while((i=lnis.read())!=-1)
         {
            c=(char)i;
            System.out.println(c);
            
         //  lnis.skip(1);
         }
      }catch(Exception e){
         
         e.printStackTrace();
      }finally{
         
         if(fis!=null)
            fis.close();
         if(lnis!=null)
            lnis.close();      
      }
   }
}