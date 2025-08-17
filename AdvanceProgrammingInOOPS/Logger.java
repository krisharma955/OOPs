package AdvanceProgrammingInOOPS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static class logger {
        private String path;

        logger(String path) throws IOException{
            File file = new File(path);
            if(!file.exists()) file.createNewFile();
            this.path = path;
        }

        public  void log(String message) {
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
                bw.write(message);
                bw.newLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) throws IOException{
        logger l = new logger("C:\\Users\\krish\\Desktop\\core_java\\OOPs\\AdvanceProgrammingInOOPS\\log.txt");
        l.log("log 1");
        l.log("log 2");
        l.log("log 3");
        l.log("log 4");
    }
}
