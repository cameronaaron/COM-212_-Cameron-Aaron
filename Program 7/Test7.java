import java.io.PrintWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.InputStreamReader;
import java.lang.NumberFormatException;

public class Test7 {
    public static void main(String[]args){
        try{
            int hold[] =new int[5];
            FileReader reader=new FileReader("file.txt");
            Scanner in = new Scanner(reader);
            for(int i = 0; i<5; i++){
                hold[i]=2*Integer.parseInt(in.nextLine());

            }
            reader.close();
            PrintWriter out = new PrintWriter("file.txt");
            for(int i=0; i<5; i++){
                out.println(hold[i]);

            }
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+ e);
        }
        catch (NumberFormatException e){
            System.out.println("Must be all numbers" + e);
        }
    }
}
