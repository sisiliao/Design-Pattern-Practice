import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel
{
    private int x = 200;
    private int y = 200;

    public void display()
    {
        x ++;
        y ++;

        //重绘JPanel  
        this.repaint();
    }

    /**
     * repaint方法会调用paint方法，并自动获得Graphics对像 
     * 然后可以用该对像进行2D画图 
     * 注：该方法是重写了JPanel的paint方法 
     */
    public void paint(Graphics g)
    {
        //调用的super.paint(g),让父类做一些事前的工作，如刷新屏幕  
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;

        g2d.setColor(Color.RED);//设置画图的颜色  
        g2d.fill3DRect(x, y, 100, 100, true);//填充一个矩形         
    }
}  