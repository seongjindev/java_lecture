package InputOutput;

import java.io.*;

public class DataInOut {
    public static void main(String[] args){

        String str = "hello world@";
        OutputStream os = null;
        DataOutputStream dos = null;

        try{
            os = new FileOutputStream("/Users/bae/Documents/GitHub/java_lecture/output4.txt");
            dos = new DataOutputStream(os);

            dos.writeUTF(str);

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(dos != null) dos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try{
                if(os != null) os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        InputStream is = null;
        DataInputStream dis = null;
        OutputStream os2 = null;
        DataOutputStream dos2 = null;

        try{
            is = new FileInputStream("/Users/bae/Documents/GitHub/java_lecture/output4.txt");
            dis = new DataInputStream(is);

            String str2 = dis.readUTF();

            os2 = new FileOutputStream("/Users/bae/Documents/GitHub/java_lecture/output5.txt");
            dos2 = new DataOutputStream(os2);

            dos2.writeUTF(str2);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(dos2 != null) dos2.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(os2 != null) os2.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(is != null) is.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(dis != null) dis.close();
            }catch (IOException e){
                e.printStackTrace();
            }


        }


    }
}
