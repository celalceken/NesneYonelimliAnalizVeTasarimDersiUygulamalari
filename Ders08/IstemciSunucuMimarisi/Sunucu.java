
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class Sunucu implements Runnable {

    Socket istemciSoketi;
    Sunucu(Socket istemciSoketi) {
        this.istemciSoketi = istemciSoketi;
    }

    public static void main(String[] args)   throws Exception {
        ServerSocket sunucuSoketi = new ServerSocket(8001);
        System.out.println("Sunucu oluşturuldu. İstek gelmesi bekleniyor...");
        while (true) {
            Socket istemciSoketi = sunucuSoketi.accept();
            System.out.println(istemciSoketi.getRemoteSocketAddress() + " baglandi.");
            new Thread(new Sunucu(istemciSoketi)).start();
        }
    }
    public void run() {
        try {
            PrintWriter out = new PrintWriter(istemciSoketi.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(istemciSoketi.getInputStream()));

            String inputLine, outputLine;
            System.out.println("istemciden girdi bekleniyor...");
            //
            do { // istemciden gelen string okunuyor...
                inputLine = in.readLine();
                System.out.println(istemciSoketi.getRemoteSocketAddress() + "istemcisinden gelen :" + inputLine);
                outputLine = inputLine.toUpperCase(); //

                out.println(outputLine); //
            } while (!inputLine.equals("son"));
            System.out.println(istemciSoketi.getLocalSocketAddress() + " baglantisi kesildi.");
            // stream ve socketleri kapat.

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
