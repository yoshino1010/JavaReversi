/**
 * Created by yoshino on 2017/01/29.
 */
class Info {
    private final static int CELL_SIZE = 70;
    private final static String BACK_COLOR = "27913D";
    private final static int NONE = 0;
    private final static int WHITE = 1;
    private final static int BLACK = 2;

    static int getCELL_SIZE() {
        return CELL_SIZE;
    }

    static int getBORD_SIZE() {
        return CELL_SIZE * 8;
    }

    static String getBACK_COLOR(){
        return BACK_COLOR;
    }

    static int getWhite(){ return WHITE; }

    static int getBlack(){ return BLACK; }

    static int getNone(){ return NONE; }
}
