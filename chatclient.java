package Java_Project;
import java.net.*;
import java.io.*;

public class chatclient {
    public static void main(String args[]) throws Exception {
        Socket sk = new Socket("127.0.0.1", 2000);
        BufferedReader sin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream sout = new PrintStream(sk.getOutputStream());
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.print("\n Welcome to the chat room \n \n");
        while (true) {
            System.out.print("Kousik Roy : ");
            s = stdin.readLine();
            sout.println(s);
            s = sin.readLine();
            System.out.print("Mandeep : " + s + "\n");
            if (s.equalsIgnoreCase("BYE"))
                break;
        }
        sk.close();
        sin.close();
        sout.close();
        stdin.close();
    }
}









