
package quiz.application1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
     JTextField tfname;
    Login()
    {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));
       JLabel image =new JLabel(i1);//IMAGE KE LIYE HAI
       image.setBounds(0,0,600,500);
       add(image);
       
       JLabel heading = new JLabel("simple minds");//HEADING KE LIYE HAI
       heading.setBounds(750,60,300,45);
       heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
       heading.setForeground(new Color(30,144,254));
       add(heading);
       
       
       JLabel name = new JLabel("Enter yours name");// NAME FORMATE KE LIYE
       name.setBounds(810,150,300,20);
       name.setFont(new Font("Monolian Baiti",Font.BOLD,18));
       name.setForeground(new Color(30,144,254));
           add(name);
       
           tfname = new JTextField();//BOX KE LIYE HAI
           tfname.setBounds(735,200,300,25);
           tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
           add(tfname);
           
            rules = new JButton("submit");//SUBMIT BUTTOPN
           rules.setBounds(735,270,120,25);
           rules.setBackground(new Color(30,144,254));
           rules.setForeground(Color.WHITE);
           rules.addActionListener(this);
           add(rules);
       
           
             back = new JButton("Back");//BACK BOTTON
           back.setBounds(915,270,120,25);
           back.setBackground(new Color(30,144,254));
           back.setForeground(Color.WHITE);
           back.addActionListener(this);
           add(back);
       
       
       
        setSize(1200,500);
        setLocation(200,150);
        
       
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name =tfname.getText();
            setVisible(false);
            new Submit(name);
            
        }else if (ae.getSource()==back){
            setVisible(false);
            
        }
        
    }

public static void main(String[] args)
{
    new Login();
} 
}

