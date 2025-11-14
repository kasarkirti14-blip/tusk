package quiz.app;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame {
    
   
    public Score(String name,int score) {
        JButton exit;
            //TODO Auto-generated constructor stub
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("score.jpeg"));

            Image i2 =  i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(60,200,200,150);
            add(image);

            JLabel heading  = new JLabel("Thank You " + name + " For Playing Quiz Test ");
            heading.setBounds(100,80,700,30);
            heading.setFont(new Font("Tohama",Font.BOLD,26));
            add(heading);

            JLabel Score = new JLabel("Your Score is "+ score);
            Score.setBounds(350,200,300,30);
            Score.setFont(new Font("Tohama",Font.BOLD,26));
            add(Score);
             
             exit = new JButton("Exit");
            exit.setBackground(new Color(22,99,54));
            exit.setBounds(325, 400, 100, 40);
            exit.setForeground(Color.WHITE);
            add(exit);

            exit.addActionListener(new ActionListener()
            {
                 @Override
                 public void actionPerformed(ActionEvent e)
                 {
                    setVisible(false);
                    new main();
                 }
            });
            ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("back.jpeg"));

            Image i22 =  i11.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
            ImageIcon i33 = new ImageIcon(i22);
            JLabel imagee = new JLabel(i33);
            imagee.setBounds(0,0,750,550);
            add(imagee);
           

            setSize(750,550);
            setLocation(450,150);
            setLayout(null);
            setVisible(true);
        }
        public static void main(String[] args) {
            new Score("users", 0);
        
    }
}
