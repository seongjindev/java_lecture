package InputOutput;

import java.io.*;

public class BufferdInOut {
    public static void main(String[] args){
        String fileName = "/Users/bae/Documents/GitHub/java_lecture/output.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try{
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String strLine;

            while((strLine = br.readLine())!=null){
                System.out.println(strLine);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br != null) br.close();
                if(fr != null) fr.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }

        String fileName2 = "/Users/bae/Documents/GitHub/java_lecture/bufferedOut.txt";
        BufferedWriter bw = null;
        FileWriter fw = null;

        try{
            String str = "hello coding\n";
            str += "java";
            fw = new FileWriter(fileName2);
            bw = new BufferedWriter(fw);
            bw.write(str);
            System.out.println("end");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(bw != null) bw.close();
                if(fw != null) fw.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
