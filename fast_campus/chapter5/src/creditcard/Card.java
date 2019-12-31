package creditcard;

public class Card {
    private static int serialN = 10001;
    private int SN;
    Card(){
        setSN(serialN);
        serialN++;
    }

    public int getSN() {
        return SN;
    }

    public void setSN(int SN) {
        this.SN = SN;
    }
}
