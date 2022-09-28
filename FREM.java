import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;

/**
 * Created by Qursan on 25/09/22.
 */
public class FREM extends JFrame{

     public void paint(Graphics g)
     {
         int wideth;
         int hight;
         int x;
         int y;

         for ( wideth = 0;  wideth < 8;  wideth++ )
         {
             for ( hight = 0;  hight < 8;  hight++)
             {
                 x = hight * 100;
                 y = wideth * 100;
                 if ( (wideth % 2) == (hight % 2) )
                     g.setColor(Color.WHITE);
                 else
                     g.setColor(Color.BLACK);
                 g.fillRect(x, y, 100, 100);
             }
         }
     }

     public static void main(String args[]) {
         FREM frame=new FREM();
         frame.setTitle("FREM");
         frame.setSize(100,100);
         frame.setVisible(true);
     }
}


