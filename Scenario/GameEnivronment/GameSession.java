package GameEnivronment;



public class GameSession {
    private int timeLapse;
    private int amountTraps;
    private GameField coordinates;


    public GameSession(int timeLapse, int amountTraps) {
        this.timeLapse = timeLapse;
        this.amountTraps = amountTraps;
    }


    public int getTimeLapse() {
        return timeLapse;
    }

    public void setTimeLapse(int timeLapse) {
        this.timeLapse = timeLapse;
    }

    public int getAmountTraps() {
        return amountTraps;
    }

    public void setAmountTraps(int amountTraps) {
        this.amountTraps = amountTraps;
    }





}
