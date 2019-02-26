import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PanelTest
{
    public static void main(String[] args)
    {
        JFrame  jf = new JFrame();
        JPanel jp = new JPanel();

        jf.setBounds(200, 200, 500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //be careful
        Cool303Button.theme = new SummerTheme();
        Cool303Button b1 = new Cool303Button("sisi");
        jp.add(b1);

        jf.add(jp);
        jf.setVisible(true);

       /* while(true)
        {
            //不停的重绘JPanel,实现动画的效果
            jp.display();

            try
            {
                Thread.sleep(300);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }*/
    }
}