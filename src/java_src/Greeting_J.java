import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * java code
 *
 * Created by lizihanglove on 2017/5/9.
 */
public class Greeting_J {

   public static void main(String[] args){

       System.out.println("hello");

       for (int i = 0;i<10 ;i++) {
           System.out.println("hi");
       }

       String s = "";
       if (s != null) {
           StringBuffer stringBuffer = new StringBuffer(s);
           System.out.println(stringBuffer.reverse().toString());
       } else {
           //do other things
       }

       try {
           new FileInputStream("file");
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }

}

