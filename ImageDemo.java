import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.imageio.*;

class ImageTest extends JPanel
{
    String filename="andr.jpg";
    Image image;
    Image scaleImage;
    ImageTest(int width,int height) {
        setSize(width,height);

        try {
          image=ImageIO.read(new File(filename));
          scaleImage=image.getScaledInstance(500,500,Image.SCALE_DEFAULT);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
       g.drawImage(scaleImage,100,100,null);
       //g.copyArea(0,0,imageWidth,imageHeight,)
    }
}

public class ImageDemo
{
   public static void main(String[] args) {
       JFrame frame = new JFrame("Demo");
       frame.add(new ImageTest(500,300));
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(0, 0, 800, 600);
       frame.setVisible(true);
       //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
       //frame.setPreferredSize(new Dimension(200,200));
    }
}
