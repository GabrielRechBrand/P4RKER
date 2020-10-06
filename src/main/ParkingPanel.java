package main;

import javax.swing.*;
import java.awt.*;

public class ParkingPanel extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 500, HEIGHT = 250;

    private Thread thread;
    private boolean running;


    public ParkingPanel() {
        setFocusable(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        start();
    }
}