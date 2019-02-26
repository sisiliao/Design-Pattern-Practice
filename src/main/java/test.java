import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test extends JPanel {
    private JFrame mainF;
    private JPanel mainP;
    //private JLabel headerLabel;
    private JButton b1;

    public test(){
        prepareGui();
    }

    public static void main(String[] args){
        test t = new test();
        t.showButton();
    }

    private void prepareGui(){
        mainF = new JFrame("test button");
        mainF.setSize(400,400);
        mainF.setLayout(new FlowLayout());

        mainF.setVisible(true);
    }

    private void showButton(){
        b1 = new JButton("sisi");
        b1.setBackground(Color.blue);
        b1.setForeground(Color.RED);
        b1.setOpaque(true);
        b1.setActionCommand("who");

        b1.addActionListener(new ButtonClickListener());

        mainP = new JPanel();
        mainP.add(b1);
        mainF.add(mainP);
        mainF.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if(command.equals("who")){
                //display();

            }

        }
    }


}
