package Sustainopoly;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


/**
 *  Get pictures
 */
public class GameUtil {
    public static Image getImage(String path) {   // ;
       BufferedImage img = null;
        URL u =  GameUtil.class.getClassLoader().getResource(path);  //�᷵��һ�� URL ����

        try{
            img = ImageIO.read(u);  // ����ᱨ��
        } catch(IOException e){
            e.printStackTrace();
        }

         return img;
    }

    public static void main(String[] args) {
       Image img = GameUtil.getImage("images/Dicebutton.jpg");
        System.out.println(img);
    }
}
