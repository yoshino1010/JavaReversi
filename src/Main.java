/**
 * Created by yoshino on 2017/01/29.
 */
public class Main {
    public static void main(String[] args){
        Frame frame = new Frame("Reversi");
        Bord bord = new Bord();
        Panel panel = new Panel(bord);
        frame.add(panel);
        frame.setVisible(true);
    }
}
