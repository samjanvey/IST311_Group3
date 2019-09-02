
package View;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class InitialFrame extends JFrame {
    protected InitialPanel ip;
    
    public InitialFrame() {
        super("IST 311 - Group 3");
        setupLayoutForMacs();
        ip = new InitialPanel();
        add(ip);
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(840, 680);
        setVisible(true);
    }
    
    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }
    
    /**
     * @return the Initial Panel
     */
    public InitialPanel getIp()
    {
        return ip;
    }

    /**
     * @param ip the Initial Panel to set
     */
    public void setIp(InitialPanel ip)
    {
        this.ip = ip;
    }
}
