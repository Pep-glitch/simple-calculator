package app;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.AWTEvent.*;
import java.lang.*;
class NewEventListener implements ActionListener, ItemListener
{
    Application ap;
    NewEventListener(Application a)
    {
        this.ap=a;
    }
    public void itemStateChanged(ItemEvent ee)
    {

    }
    public void actionPerformed(ActionEvent e)
    { 
       // String num = ap.txtbox.getText();
        if(e.getActionCommand().equals("0"))
        {
            /*
            Data d = new Data();
            try {
                d.saveObject("number1.txt");
                
            } catch (Exception meme) {
                System.out.println(meme);
            }
            */
            ap.txtbox.append("0");
        }
        else if(e.getActionCommand().equals("1"))
        {
            /*
            Data d = new Data("1");
            try {
                d.saveObject("number1.txt");
                
            } catch (Exception meme) {
                System.out.println(meme);
            }*/
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
            ap.txtbox.setText("");
        }
        else if(e.getActionCommand().equals("/"))
        {
            ap.txtbox.setText("");
        }
        else if(e.getActionCommand().equals("*"))
        {
            ap.txtbox.setText("");
        }
        else if(e.getActionCommand().equals("+"))
        {
            String newOne;
            try {
                newOne=Data.retrievObject("number1.txt"); 
                Double number1= Double.parseDouble(newOne);
                System.out.println( Data.addition(number1,34.34));    
            } catch (Exception mem) {
              System.out.println(mem);
            }
            
          
        }
        else if(e.getActionCommand().equals("DEL"))
        {
            ap.txtbox.setText(" ");
        }
        else if(e.getActionCommand().equals("="))
        {
            ap.txtbox.setText("");
        }
       /* String name = ap.txtbox.getText();
        if(e.getActionCommand().equals("Send Data"))
        {
            Data d = new Data(name);
            try {
               d.saveObject("names.txt");
            } catch (Exception m) {
                System.out.println("OOPS SOMETHING WENT WRONG");
             
            }
        }
        */
    }
}