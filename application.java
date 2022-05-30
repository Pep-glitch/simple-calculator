package app;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.awt.Window.*;
class Application extends Frame
{
    //Components Declarations
    //TextField txtbox ;
    TextArea txtbox;
    Button btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven;
    Button btn_eight,btn_nine,btn_zero,btn_plus,btn_mul,btn_minus,btn_div,btn_equal,btn_clr;
    Label lb;
    NewEventListener el = new NewEventListener(this);
    Application()
    {
        super("CALCULATOR");
        setBounds(480,150,400,400);
        setLayout(null);


        //initializing textbox and label
       // lb = new Label("CALCULATOR");
        txtbox = new TextArea();

        //initializing first row buttons
        btn_seven = new Button("7");
        btn_eight = new Button("8");
        btn_nine = new Button("9");
        btn_div = new Button("/");
       
        //initializing second row buttons
        btn_four = new Button("4");
        btn_five = new Button("5");
        btn_six = new Button("6");
        btn_mul= new Button("*");

        //initializing third row buttons
        btn_one = new Button("1");
        btn_two = new Button("2");
        btn_three = new Button("3");
        btn_minus = new Button("-");
       
        //initializing last row buttons
        btn_clr = new Button("DEL");
        btn_zero = new Button("0");
        btn_equal = new Button("=");
        btn_plus= new Button("+");
       
        //setting size of TextBox and Label
        txtbox.setBounds(50,50,310,80);
        txtbox.setColumns(2);
       // lb.setBounds(80,10,30,40);

        //size of first row buttons
        btn_seven.setBounds(50,150,70,40);
        btn_eight.setBounds(130,150,70,40);
        btn_nine.setBounds(210,150,70,40); 
        btn_div.setBounds(290,150,70,40);
       
        //size of second row buttons
        btn_four.setBounds(50,200,70,40); 
        btn_five.setBounds(130,200,70,40);
        btn_six.setBounds(210,200,70,40);
        btn_minus.setBounds(290,200,70,40);

        //size of third row buttons
        btn_one.setBounds(50,260,70,40);
        btn_two.setBounds(130,260,70,40);
        btn_three.setBounds(210,260,70,40);
        btn_mul.setBounds(290,260,70,40);

        //size of last row buttons
        btn_clr.setBounds(50,320,70,40); 
        btn_zero.setBounds(130,320,70,40);
        btn_equal.setBounds(210,320,70,40);
        btn_plus.setBounds(290,320,70,40);
        
         //adding textbox
         add(txtbox);
        // add(lb);

         //adding first row buttons
        add(btn_seven);
        add(btn_eight);
        add(btn_nine);
        add(btn_div);

         //adding second row buttons
         add(btn_four);
         add(btn_five);
         add(btn_six);
         add(btn_mul);

         //adding third row buttons
         add(btn_one);
         add(btn_two);
         add(btn_three);
         add(btn_minus);

         //adding last row buttons
         add(btn_clr);
         add(btn_zero);
         add(btn_equal);
         add(btn_plus);
        
        //Action Listeners
        btn_one.addActionListener(el);
        btn_two.addActionListener(el);
        btn_three.addActionListener(el);
        btn_four.addActionListener(el);
        btn_five.addActionListener(el);
        btn_six.addActionListener(el);
        btn_seven.addActionListener(el);
        btn_eight.addActionListener(el);
        btn_nine.addActionListener(el);
        btn_zero.addActionListener(el);
        btn_plus.addActionListener(el);
        btn_mul.addActionListener(el);
        btn_minus.addActionListener(el);
        btn_div.addActionListener(el);
        btn_equal.addActionListener(el);
        btn_clr.addActionListener(el);
        
        addWindowListener(new WindowAdapter()
        {
            //use closing method Not Closed
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) 
    {
      Application ap = new Application();
      ap.setVisible(true) ;
    }
}
