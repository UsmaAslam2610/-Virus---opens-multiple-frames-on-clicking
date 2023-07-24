
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UsmaAslam
 */
public class btnHandler implements ActionListener{

    GUI refg;
    Random rndm;
    public btnHandler(GUI gg)
    {
        refg = gg;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       String btnText = e.getActionCommand();
       if(btnText.equals("Click Me"))
           refg.virus();
    }
}
//new GUI().fr.setLocation(rndm.nextInt(900), rndm.nextInt(900));