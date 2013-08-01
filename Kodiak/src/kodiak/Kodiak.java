/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kodiak;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Wayne E Starr
 */
public class Kodiak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jfmMain = new JFrame();
        JPanel jplMain = new Main();
        
        jfmMain.add(jplMain);
        jfmMain.setTitle("Kodiak");
        jfmMain.pack();
        jfmMain.setVisible(true);
    }
}
