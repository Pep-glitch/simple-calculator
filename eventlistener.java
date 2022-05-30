package app;
import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.AWTEvent.*;
import java.lang.*;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
class NewEventListener implements ActionListener, ItemListener
{
    Application ap;
    int op,num, num2; 
    Integer sum;
    String one,two;
    NewEventListener(Application a)
    {
        this.ap=a;
    }
    public void itemStateChanged(ItemEvent ee)
    {

    }
    public void actionPerformed(ActionEvent e)
    { 
       
        if(e.getActionCommand().equals("0"))
        {
            ap.txtbox.append("0");
        }
        else if(e.getActionCommand().equals("1"))
        {
       
            ap.txtbox.append("1");
        }
        else if(e.getActionCommand().equals("2"))
        {
            ap.txtbox.append("2");
        }
        else if(e.getActionCommand().equals("3"))
        {
            ap.txtbox.append("3");
        }
        else if(e.getActionCommand().equals("4"))
        { 
            ap.txtbox.append("4");
        }
        else if(e.getActionCommand().equals("5"))
        {
            ap.txtbox.append("5");
        }
        else if(e.getActionCommand().equals("6"))
        {
            ap.txtbox.append("6");
        }
        else if(e.getActionCommand().equals("7"))
        {
            ap.txtbox.append("7");
        }
        else if(e.getActionCommand().equals("8"))
        {
            ap.txtbox.append("8");
        }
        else if(e.getActionCommand().equals("9"))
        {
            ap.txtbox.append("9");
        }
        else if(e.getActionCommand().equals("-"))
        {
            one = ap.txtbox.getText();
            ap.txtbox.setText(""); 
            op = 3;
        }
        else if(e.getActionCommand().equals("/"))
        {
            one = ap.txtbox.getText();
            ap.txtbox.setText(""); 
            op = 4;
        }
        else if(e.getActionCommand().equals("*"))
        {
            one = ap.txtbox.getText();
            ap.txtbox.setText(""); 
            op = 2;
        }
         if(e.getActionCommand().equals("+"))
        {
            one = ap.txtbox.getText();
            ap.txtbox.setText(""); 
            op = 1;
        }
        if(e.getActionCommand().equals("="))
            {
                 num = Integer.parseInt(one.trim());
                 two = ap.txtbox.getText();
                 num2 = Integer.parseInt(two.trim());
                if(op==1)
                {
                    sum=num+num2;
                }
                else if(op==2)
                {
                   sum = num*num2;  
                }
                else if(op==3)
                {
                    sum = num-num2;
                }
                else
                {
                    try {
                     sum = num/num2;
                    } catch (Exception xcp) {
                       JOptionPane.showMessageDialog(null, xcp, "Exception", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                ap.txtbox.setText(sum.toString());
                 
            }
        else if(e.getActionCommand().equals("DEL"))
        {
            ap.txtbox.setText(" ");
        }
    }
}