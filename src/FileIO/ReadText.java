package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadText {
    static String absolutePath=System.getProperty("user.dir");
    static String relativePath="/src/FileIO/sample.txt";
    static final String path=absolutePath+relativePath;
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void main(String[] args) {
        String data="";

        try{
            fileReader=new FileReader(path);
            bufferedReader=new BufferedReader(fileReader);

        try{
            while((data=bufferedReader.readLine()) !=null){
                System.out.println(data);
            }
            System.out.println("\ndone reading file\n");

        }catch(Exception e1){
            System.out.println("Unable to read line");

        }

        }catch(FileNotFoundException ex){
            System.out.println("File not Found at " +path);

        }catch(Exception ex){
            System.out.println("Unable to open Buffered reader on file at path: " +path);
        }finally{
            try{
                bufferedReader.close();
            }catch(Exception e){
                System.out.println("Unable to close buffered reader");
            }

        }

    }
}
