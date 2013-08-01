/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kodiak;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Wayne E Starr
 */
public class Kodiak {
    
    static JFrame jfmMain = new JFrame();
    static JPanel jplMain = new Main();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jfmMain.add(jplMain);
        jfmMain.setTitle("Kodiak");
        jfmMain.pack();
        jfmMain.setVisible(true);
    }
    
}
