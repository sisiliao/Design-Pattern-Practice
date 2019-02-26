import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;

class Cool303Button extends JButton {
    private String text;
    private String state = "normal";
    static Theme theme;

    //constructor

    public Cool303Button(String text){
        super(text);
        this.text = text;
        //this.setBackground(Color.GREEN);
        /*this.setForeground(Color.RED);
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);*/
        //this.setOpaque(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        theme.paintButton(g, this);
    }
}

