import java.awt.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yoshino on 2017/01/29.
 */
class Bord {
    private static int bord[][] = new int[8][8];
    private static List<Point> canPutPoint;

    Bord(){
        for (int i = 0; i < 8; i++) Arrays.fill(bord[i], Info.getNone());

        bord[3][3] = Info.getWhite();
        bord[3][4] = Info.getBlack();
        bord[4][3] = Info.getBlack();
        bord[4][4] = Info.getWhite();
    }

    int getInfo(int x, int y){
        return bord[x][y];
    }


}
