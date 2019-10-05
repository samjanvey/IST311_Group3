 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Brad
 */
public class MainFrame extends JFrame {
    private MainPanel mPanel;
    private GridBagLayout mainGrid;
    private TransactionsPanel tPanel;
    private GridLayout tLayout;
    
    public MainFrame(){
        super("IST 311 - Group 3");
        setupLayoutForMacs();
        mPanel = new MainPanel();
        mPanel.setLayout(mainGrid);
        GridBagConstraints mpgbc = new GridBagConstraints();
        
        tPanel = new TransactionsPanel();
        tLayout = new GridLayout();
        tPanel.setLayout(tLayout);
        
        add(mPanel);
        add(tPanel);
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 800);
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
    
    public TransactionsPanel gettPanel() {
        return tPanel;
    }

    public void settPanel(TransactionsPanel tPanel) {
        this.tPanel = tPanel;
    }

//    public GridLayout gettLayout() {
//        return tLayout;
//    }
//
//    public void settLayout(GridLayout tLayout) {
//        this.tLayout = tLayout;
//    }
//    
//    public GridBagLayout getMainGrid() {
//        return mainGrid;
//    }
//
//    public void setMainGrid(GridBagLayout mainGrid) {
//        this.mainGrid = mainGrid;
//    }
//    
//    public MainPanel getmPanel() {
//        return mPanel;
//    }
//
//    public void setmPanel(MainPanel mPanel) {
//        this.mPanel = mPanel;
//    }
}
