package Java_Project;
import java.net.*;
import java.io.*;

public class chatserver {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket sk = ss.accept();
        BufferedReader cin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream cout = new PrintStream(sk.getOutputStream());
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.print("\n Welcome to the chat room \n \n");
        while (true) {
            s = cin.readLine();
            if (s.equalsIgnoreCase("END")) {
                cout.println("BYE");
                break;
            }
            System.out.print("Kousik Roy : " + s + "\n");
            System.out.print("Mandeep : ");
            s = stdin.readLine();
            cout.println(s);
        }
        ss.close();
        sk.close();
        cin.close();
        cout.close();
        stdin.close();
    }
}



