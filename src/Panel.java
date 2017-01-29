import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

/**
 * Created by yoshino on 2017/01/29.
 */
class Panel extends JPanel implements MouseListener{
    private java.util.List<BattlePerson> personList;
    private Bord bord;

    Panel(Bord bord){
        addMouseListener(this);
        this.bord = bord;
        setBackground(new Color(Integer.parseInt(Info.getBACK_COLOR(), 16)));
    }

    void addPerson(BattlePerson p){
        personList.add(p);
    }

    boolean precedingDecide(){
        Random rand = new Random();
        int i = rand.nextInt(2);
        if (personList.size() < 2) return false;
        if (i == 1){
            BattlePerson b = personList.get(i);
            personList.set(i, personList.get(i-1));
            personList.set(i-1, b);
        }
        return true;
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                int x = i * Info.getCELL_SIZE();
                int y = j * Info.getCELL_SIZE();

                if (bord.getInfo(i, j) == Info.getWhite()) g2.setColor(Color.WHITE);
                else if (bord.getInfo(i, j) == Info.getBlack()) g2.setColor(Color.BLACK);
                else continue;

                g2.fillArc(x+5, y+5, Info.getCELL_SIZE()-10, Info.getCELL_SIZE()-10, 0, 360);
            }
        }

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
