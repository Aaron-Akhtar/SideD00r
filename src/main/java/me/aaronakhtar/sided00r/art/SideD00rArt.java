package me.aaronakhtar.sided00r.art;

import java.io.BufferedWriter;

public class SideD00rArt {

    protected static final String LINE_BREAK = "BR";
    private static final SideD00rArtEnum[] arts = SideD00rArtEnum.values();

    public static void beginWelcomeArtProcess(BufferedWriter writer) throws Exception {
        writer.write("Welcome to\r\n");
        writer.flush();
        Thread.sleep(1500);
        for (SideD00rArtEnum art : arts){
            for (String s : art.getArt()){
                writer.write(s + "\r\n");
                writer.flush();
                Thread.sleep(350);
            }
            writer.write("\r\n");
            writer.flush();
        }
    }


}
