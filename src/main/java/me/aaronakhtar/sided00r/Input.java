package me.aaronakhtar.sided00r;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input {

    private static Thread readInput(InputStream inputStream, BufferedWriter writer){
        return new Thread(){
            @Override
            public void run() {
                try(BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))){
                    String s;
                    while((s = reader.readLine()) != null){
                        writer.write(s + "\r\n");
                        writer.flush();
                    }
                }catch (Exception e){
                 //   e.printStackTrace();
                }
            }
        };
    }

    public static void processInput(String i, BufferedWriter writer){
        try{
            final ProcessBuilder processBuilder = new ProcessBuilder(i.split(" "));
            final Process exec = processBuilder.start();
            final Thread t = readInput(exec.getInputStream(), writer);
            t.start();
            t.join();
        }catch (Exception e){
           // e.printStackTrace();
        }
    }

}
