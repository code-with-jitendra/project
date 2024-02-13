
package quiz.application1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class Score  extends JFrame implements ActionListener{
   Score (String name,int score){
       
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
           
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.png"));
       Image i2 = i1.getImage().getScaledInstance(300,250, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       
       JLabel image =new JLabel(i3);//IMAGE KE LIYE HAI
       image.setBounds(0, 200,300,250);
       add(image);
       
       JLabel heading = new JLabel("Thankyou " + name + "For playing Simple minds");//serial number ke liye
       heading.setBounds(45, 30,700,30);
       heading.setFont(new Font("Tahoma",Font.PLAIN, 26));
       add(heading);
       
       JLabel lblscore = new JLabel("Your score is" + score);//serial number ke liye
       lblscore.setBounds(350, 200,300,30);
       lblscore.setFont(new Font("Tahoma",Font.PLAIN, 26));
       add(lblscore);
       
         JButton Submit = new JButton("Play Again");
         Submit.setBounds(380,270,120,30);
        
         Submit.setBackground(new Color(30,144,255));
         Submit.setForeground(Color.WHITE);
         Submit.addActionListener(this);
         add(Submit);
       
       

    setVisible(true);
        
    }
   public void actionPerformed(ActionEvent ae){
       setVisible(false);
       new Login();
       
   }
   
    public static void main(String[] args){
        new Score("User",0);
    }
}
