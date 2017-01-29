import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by yoshino on 2017/01/29.
 */
class Panel extends JPanel implements MouseListener{
    Panel(){
        addMouseListener(this);
        setBackground(new Color(Integer.parseInt(Info.getBACK_COLOR(), 16)));
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);
        for (int i = 0; i < Info.getBORD_SIZE(); i += Info.getCELL_SIZE()){
            g2.drawLine(i, 0, i, Info.getBORD_SIZE());
            g2.drawLine(0, i, Info.getBORD_SIZE(), i);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
