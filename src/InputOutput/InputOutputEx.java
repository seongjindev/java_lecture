package InputOutput;

import java.io.*;

public class InputOutputEx {
    public static void main(String[] args){
        //read()
        InputStream is = null;
        try{
            is = new FileInputStream("/Users/bae/Documents/GitHub/java_lecture/out.txt");
            int data = 0;
            while(true){
                try{
                    data = is.read();
                }catch (IOException e){
                    e.printStackTrace();
                }
                if(data ==-1) break;
                System.out.println("data = "+ data);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                if(is !=null) is.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("-------------");

        //read(byte[])
        InputStream is2 = null;
        try{
            is2 = new FileInputStream("/Users/bae/Documents/GitHub/java_lecture/out.txt");
            int data = 0;
            byte[] bs = new byte[3];
            while(true){
                try{
                    data = is2.read(bs);
                }catch (IOException e){
                    e.printStackTrace();
                }
                if(data == -1) break;
                System.out.println("data : "+ data);
                for(int i = 0;i<bs.length;i++){
                    System.out.println("bs["+i+"] : " + bs[i] );
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                if(is2 != null) is2.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("-------------------------");

        //write()
        OutputStream os = null;
        try{
            os = new FileOutputStream("/Users/bae/Documents/GitHub/java_lecture/output.txt");
            String data = "Hello world";
            byte[] arr = data.getBytes();
            try{
                os.write(arr);
            }catch(IOException e){
                e.printStackTrace();
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                if(os != null) os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println("-----------------");

        OutputStream os2 = null;
        try{
            os2 = new FileOutputStream("/Users/bae/Documents/GitHub/java_lecture/output2.txt");
            String data = "Hello java";
            byte[] arr = data.getBytes();

            try{
                os2.write(arr,0 ,5);
            }catch(IOException e){
                e.printStackTrace();
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try{
                if(os2 != null) os2.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        //copy
        InputStream isc = null;
        OutputStream osc = null;
        try{
            isc = new FileInputStream("/Users/bae/Documents/GitHub/java_lecture/output2.txt");
            osc = new FileOutputStream("/Users/bae/Documents/GitHub/java_lecture/output3.txt");

            byte[] arr = new byte[3];
            while(true){
                int len = isc.read(arr);
                if(len==-1) break;
                osc.write(arr, 0,3);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(isc !=null) isc.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(osc != null) osc.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }



    }
}
