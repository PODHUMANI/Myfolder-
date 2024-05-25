//Write a HTTP web client program to download a web page using TCP sockets.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class NewClass {
   public static void main(String[] args) {
      URL url;
      InputStream is = null;
      BufferedReader br;
      String line;
      try {
         url = new URL("https://www.tutorialspoint.com/javaexamples/java_methods.htm");
         is = url.openStream();  // throws an IOException
         br = new BufferedReader(new InputStreamReader(is));
          while ((line = br.readLine()) != null) {
            System.out.println(line);
         } 
      } catch (MalformedURLException mue) {
         mue.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } 
      finally {
         try {
            if (is != null) is.close();
         } catch (IOException ioe) {} 
      } 
   }
}


//2 Version
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.*;



public class NewClass {
   public static void main(String[] args) {
      URL url;
      InputStream is = null;
      BufferedReader br;
      String line;
      try {
          
          Socket s=new Socket("http://www.google.com/",80);
        // url = new URL("https://www.tutorialspoint.com/javaexamples/java_methods.htm");
      //   is = url.openStream();  // throws an IOException
         br = new BufferedReader(
            new InputStreamReader(s.getInputStream()));
            
            
            
            
          while ((line = br.readLine()) != null) {
            System.out.println(line);
         } 
      } catch (MalformedURLException mue) {
         mue.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } 
      finally {
         try {
            if (is != null) is.close();
         } catch (IOException ioe) {} 
      } 
   }
}
