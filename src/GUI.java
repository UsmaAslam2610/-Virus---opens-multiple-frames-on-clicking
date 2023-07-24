
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UsmaAslam
 */
public class GUI {
    JFrame fr;
    JButton btn;
    btnHandler hnd;
    JPanel p;
    int min ;  
    int max ; 
    Random r;
    int ran;
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    public GUI()
    {
        initGUI();
    }
   
    public void initGUI()
    {
       min = 20;
       max =40;
       r = new Random();
       ran=(int)(Math.random()*(max-min+1)+max);  
       fr = new JFrame("Virus");
       p = new JPanel();
       btn = new JButton("Click Me");
       
       hnd = new btnHandler(this);
       btn.addActionListener(hnd);
       btn.setActionCommand("Click Me");
       p.setLayout(null);
       btn.setBounds(140, 120, 100, 40);
       
       p.add(btn);
       fr.add(p);
       
       fr.setSize(400,400);
       fr.setLocationRelativeTo(null);
       fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       fr.setVisible(true);
    }
    public void virus()
    {
         for(int i=0;i<ran;i++)
       {
//            fr = new JFrame("Virus");
//            p = new JPanel();
//            btn = new JButton("Click Me");
//            
//            hnd = new btnHandler(this);
//            btn.addActionListener(hnd);
//            btn.setActionCommand("Click Me");
//            p.setLayout(null);
//            btn.setBounds(140, 120, 100, 40);
//            
//            p.add(btn);
//            fr.add(p);
//            
//            fr.setSize(400,400);
                initGUI();
            fr.setLocation(r.nextInt(1700), r.nextInt(1600));
//            fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            fr.setVisible(true);
       }
    }
}