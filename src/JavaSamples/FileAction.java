package JavaSamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileAction
{
    public static void main(String[] args) throws IOException {
        File f=new File("C:/Users/raghu/OneDrive/Documents/sample.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        fw.write(10);
        fw.write("Hello File");
        fw.flush();
        System.out.println("File created");
    }


}
