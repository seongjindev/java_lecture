package Networking;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {
    public static void main(String[] args) {
        Socket socket = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        Scanner sc = null;

        try{
            socket = new Socket("localhost",9000);
            System.out.println("서버연결완료");

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            sc = new Scanner(System.in);
            while(true){
                System.out.println("메시지 입력");
                String outMessage = sc.nextLine();
                dataOutputStream.writeUTF(outMessage);
                dataOutputStream.flush();

                String inMessage = dataInputStream.readUTF();
                System.out.println("inMessage : "+inMessage);
                if(outMessage.equals("STOP")) break;

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(dataOutputStream != null) dataOutputStream.close();
                if(outputStream != null) outputStream.close();
                if(dataInputStream != null) dataInputStream.close();
                if(inputStream != null) inputStream.close();
                if(socket != null) socket.close();
                if(sc != null) sc.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
