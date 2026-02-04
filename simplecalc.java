import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
class simplecalc extends JFrame implements ActionListener 
{ 
    JLabel l1,l2,l3; 
    JTextField t1,t2,t3; 
    JBu on b1,b2,b3,b4,b5,b6; 
    simplecalc() 
    { 
        setLayout(new GridLayout(6,6)); 
        l1=new JLabel("First Number"); 
        l2=new JLabel("Second Number"); 
        l3=new JLabel("Result"); 
         
        t1=new JTextField(20); 
        t2=new JTextField(20); 
        t3=new JTextField(20); 
         
        b1=new JButton("+"); 
        b1.addAc onListener(this); 
        b2=new JButton("-"); 
        b2.addAc onListener(this); 
        b3=new JButton("*"); 
         
        b3.addActionListener(this); 
        b4=new JButton("/"); 
        b4.addAc onListener(this); 
        b5 = new JButton("Clear"); 
        b5.addAc onListener(this); 
        b6=new JButton("Exit"); 
        b6.addActionListener(this); 
         
        add(l1); 
        add(t1); 
        add(l2); 
        add(t2); 
        add(l3); 
        add(t3); 
        add(b1); 
        add(b2); 
        add(b3); 
        add(b4); 
        add(b5); 
        add(b6); 
         
    } 
    public void ationPerformed(ActionEvent e) 
    { 
        int a=Integer.parseInt(t1.getText()); 
        int b=Integer.parseInt(t2.getText()); 
        int c=0; 
        if(e.getSource()==b1) 
        { 
            c=a+b; 
        } 
        else if(e.getSource()==b2) 
        { 
            c=a-b; 
        } 
        else if(e.getSource()==b3) 
        { 
            c=a*b; 
        } 
        else if(e.getSource()==b4) 
        { 
            c=a/b; 
        } 
        else if(e.getSource()==b5) 
        { 
            t1.setText(" "); 
            t2.setText(" "); 
            t3.setText(" "); 
        } 
        else if(e.getSource()==b6) 
        { 
            dispose(); 
            System.exit(0); 
        } 
        t3.setText(String.valueOf(c)); 
    } 
    public static void main(String ar[]) 
    { 
        simplecalc d=new simplecalc(); 
        d.setSize(600,600); 
        d.setVisible(true); 
    } 
} 
 
