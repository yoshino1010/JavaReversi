import javax.swing.*;
import java.awt.*;

/**
 * Created by yoshino on 2017/01/29.
 */
class Frame extends JFrame{
    Frame(String title){
        setTitle(title);
        getContentPane().setPreferredSize(new Dimension(Info.getBORD_SIZE()+1, Info.getBORD_SIZE()));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(Integer.parseInt(Info.getBACK_COLOR(), 16)));
    }
}
