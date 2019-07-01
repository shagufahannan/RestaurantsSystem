import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Fahim on 4/29/2017.
 */
public class Restaurant extends JFrame implements ActionListener, MouseListener {


    JButton button1;
    JButton button2;
    JButton button3;
    JLabel lbl[], lblprice[], lbl1, price1;
    JTextField num[], Num;

    private JButton ButtonYes;
    private JPanel PanelForm1;


    JTextArea Cart;
    String s[];

    private String Calculator(){
        int sum=0; int b;
        for(int i=0; i<3; i++) /**ekhane for loop e 2 er jaygay j koyta khabar item add korso, sei number hobe. say 10ta item hole i<10 likhba*/
		{
            if(num[i].getText().equals("0")){continue;}//else { b=Integer.parseInt(num[i].getText());}
            else {sum = sum + Integer.parseInt(lblprice[i].getText())*Integer.parseInt(num[i].getText());}
        }
        return Integer.toString(sum);
    }

    public Restaurant(){
        super("MenuBar");

        this.setSize(600,600);
        //this.setBackground(Color.RED);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s = new String[10];
        PanelForm1 = new JPanel();
        PanelForm1.setLayout(null);

        ButtonYes = new JButton("select");
        ButtonYes.setBounds(420, 50, 150, 25);
        ButtonYes.addActionListener(this);
        ButtonYes.addMouseListener(this);
        PanelForm1.add(ButtonYes);

        Cart = new JTextArea("");
        Cart.setBounds(350,100,200,200);// made changes here 1
        PanelForm1.add(Cart);

        lbl = new JLabel[10]; lblprice = new JLabel[10];
        num = new JTextField[10];
        lbl1 = new JLabel("Pizza"); price1 = new JLabel("200");
        Num = new JTextField("0");
        /*
        //lbl[0] = new JLabel("Burger");
        lbl1.setBounds(50,50,75,25);// made changes here 1
        PanelForm1.add(lbl1);

        //lblprice[0] = new JLabel("120");
        price1.setBounds(130,50,75,25);// made changes here 1
        PanelForm1.add(price1);

        //num[0]= new JTextField("");
        Num.setBounds(210, 50, 75,25);
        PanelForm1.add(Num);*/
        lbl[0] = new JLabel("Burger");
        lbl[0].setBounds(50,50,75,25);// made changes here 1
        PanelForm1.add(lbl[0]);

        lblprice[0] = new JLabel("120");
        lblprice[0].setBounds(130,50,75,25);// made changes here 1
        PanelForm1.add(lblprice[0]);

        num[0]= new JTextField("");
        num[0].setBounds(210, 50, 75,25);
        num[0].setText("0");
        PanelForm1.add(num[0]);
///////////////////
        lbl[01] = new JLabel("Biriany");
        lbl[01].setBounds(50,100,75,25);// made changes here 1
        PanelForm1.add(lbl[01]);

        lblprice[01] = new JLabel("200");
        lblprice[01].setBounds(130,100,75,25);// made changes here 1
        PanelForm1.add(lblprice[01]);

        num[01]= new JTextField("");
        num[01].setBounds(210, 100, 75,25);
        num[1].setText("0");
        PanelForm1.add(num[01]);

        ////////////////////////

        lbl[02] = new JLabel("cold Drinks");
        lbl[02].setBounds(50,150,75,25);// made changes here 1
        PanelForm1.add(lbl[02]);

        lblprice[02] = new JLabel("20");
        lblprice[02].setBounds(130,150,75,25);// made changes here 1
        PanelForm1.add(lblprice[02]);

        num[02]= new JTextField("");
        num[02].setBounds(210, 150, 75,25);
        num[02].setText("0");
        PanelForm1.add(num[02]);

        this.add(PanelForm1);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Cart.setText("");// clear cart
        String Str="";
        for(int i=0; i<3; i++){ /**ekhane for loop e 2 er jaygay j koyta khabar item add korso, sei number hobe. say 10ta item hole i<10 likhba*/
            String temp;
            if(num[i].getText().equals("0")){ continue; }
            else {s[i]=lbl[i].getText()+ " "+lblprice[i].getText()+"x"+num[i].getText()+"\n";}
            Str = Str+s[i];
        }
        Str = Str+"\n---------------\nTotal = "+Calculator();
        Cart.setText(Str);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
