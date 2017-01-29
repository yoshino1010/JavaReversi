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
