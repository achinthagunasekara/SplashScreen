package SplashScreen;

/*
 * @author: Achintha Gunasekara
 * @date: 14.09.2015
 */

import java.awt.*;

public class SplashScreenManager {

    //items to display when the splash screen loads
    final static String[] comps = {
                            "item_1",
                            "item_2",
                            "item_3"
    };
    
    public SplashScreenManager() {}
    
    static void renderSplashFrame(Graphics2D g, int frame) {
        g.setComposite(AlphaComposite.Clear);
        g.fillRect(120,140,200,40);
        g.setPaintMode();
        g.setColor(Color.BLACK);
        g.drawString("Loading "+comps[(frame/5)%3]+"...", 120, 150);
    }
    public void runSplash() {
        
        final SplashScreen splash = SplashScreen.getSplashScreen();
        
        if (splash == null) {
            System.out.println("SplashScreen.getSplashScreen() returned null");
            return;
        }
        
        Graphics2D g = splash.createGraphics();
        if (g == null) {
            System.out.println("g is null");
            return;
        }
        
        for(int i=0; i<100; i++) {
            renderSplashFrame(g, i);
            splash.update();
            try {
                Thread.sleep(90);
            }
            catch(InterruptedException e) {
            }
        }
        splash.close();
    }
}