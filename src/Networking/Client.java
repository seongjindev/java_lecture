package Networking;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;

        try{
            socket = new Socket("localhost",9000); //127.0.0.1 : localhost
            System.out.println("서버연결");
            System.out.println("socket : "+socket);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(socket != null) socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
