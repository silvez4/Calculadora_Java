import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

public class Client {

    public static void main(String[] args) 	{
        try {
            Socket s = null;
            InputStream i = null;
            OutputStream o = null;
            String str;
            do {

                byte[] line = new byte[100];
                System.in.read(line);
                str = new String(line);

                if(str.trim().toLowerCase(Locale.ROOT).contains("soma")
                        || str.trim().toLowerCase(Locale.ROOT).contains("sub")
                        || str.trim().toLowerCase(Locale.ROOT).contains("div")
                        || str.trim().toLowerCase(Locale.ROOT).contains("mult")){
                    s = new Socket("127.0.0.1", 9999); // Server A
                }

                if(str.trim().toLowerCase(Locale.ROOT).contains("pot")
                        || str.trim().toLowerCase(Locale.ROOT).contains("raiz")
                        || str.trim().toLowerCase(Locale.ROOT).contains("porc")){
                    s = new Socket("127.0.0.1", 9998); // Server B
                }
                i = s.getInputStream();
                o = s.getOutputStream();

                o.write(line);
                i.read(line);
                str = new String(line);

                System.out.println(str.trim());

            } while ( !str.trim().equals("bye") );
            s.close();
        }
        catch (Exception err) {
            System.err.println(err);
        }
    }

}
