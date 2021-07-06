/*
 * Decompiled with CFR 0.151.
 */
package game;

import java.awt.*;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class GameFrame
extends JFrame {
    private static final long serialVersionUID = 1L;
    public static String title = "v1.7.0";
    public static int secondsPassed;
    public static int minutesPassed;
    public static int tSecondsPassed;
    GetTheAppleGame getTheAppleGame;

    GameFrame() {
        URL resource = getClass().getClassLoader().getResource("icon_mdk.png");
        this.add(new GamePanel());
        this.setTitle("Get The Apple! " + title);
        this.setDefaultCloseOperation(3);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(resource);
        this.setIconImage(icon);
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){

            @Override
            public void run() {
                ++secondsPassed;
            }
        };
        timer.scheduleAtFixedRate(task, 1000L, 1000L);
        Timer tTimer = new Timer();
        TimerTask tTask = new TimerTask(){

            @Override
            public void run() {
                ++tSecondsPassed;
            }
        };
        tTimer.scheduleAtFixedRate(tTask, 1000L, 1000L);
    }
}

