package AdvanceProgrammingInOOPS;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        // File file = new File("/Users/krish/Desktop/core_java/OOPs/AdvanceProgrammingInOOPS/test.txt");
        // System.out.println(file.exists());
        // file.createNewFile();
        // System.out.println(file.exists());

        // BufferedWriter bw = null;
        // try {
        //     bw = new BufferedWriter(new FileWriter("C:\\Users\\krish\\Desktop\\core_java\\OOPs\\AdvanceProgrammingInOOPS\\test.txt"));
        //     bw.write("Hello World");
        //     bw.newLine();
        //     bw.write("File Handling");
        //     //? bw.flush(); // this can also be used, flush needs to be used everytime, but close to be used at the end
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     bw.close(); // close is usually written in finally block (bcz code inside it will always run)
        // }

        // BufferedReader br = null;
        // try {
        //     br = new BufferedReader(new FileReader("C:\\\\Users\\\\krish\\\\Desktop\\\\core_java\\\\OOPs\\\\AdvanceProgrammingInOOPS\\\\test.txt"));
        //     String line;
        //     while((line = br.readLine()) != null) {
        //         System.out.println("Line : " +line);
        //     }
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // } finally {
        //     br.close();
        // }

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\\\Users\\\\krish\\\\Desktop\\\\core_java\\\\OOPs\\\\AdvanceProgrammingInOOPS\\\\test.txt"));
            int ch;
            while((ch = br.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            br.close();
        }
    }
}
