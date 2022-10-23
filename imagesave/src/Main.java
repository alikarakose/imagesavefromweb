import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://www.dwd.de/DWD/wetter/aktuell/deutschland/bilder/wx_brd_akt.jpg");


        InputStream in = url.openStream();
        OutputStream out = new FileOutputStream("myImage.jpg");

        byte[] b = new byte[2048];
        int length;

        while ((length = in.read(b)) != -1) {
            out.write(b, 0, length);
        }

        in.close();
        out.close();
    }
}