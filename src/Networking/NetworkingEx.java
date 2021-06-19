package Networking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkingEx {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try{
            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비 완료");
            socket = serverSocket.accept();
            System.out.println("클라이언트 연결");
            System.out.println("Socket : "+ socket);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(serverSocket != null) serverSocket.close();
                if(socket != null) socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
