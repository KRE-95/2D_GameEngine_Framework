package GameEnivronment;

public class Player  extends Motion { // Arve alle de elementene og egenskapene fra klasse motion
        private String name;
        private int amountLife;   //each life = 100 points
        private int Score; //poeng
        private int XP;  //Bonus feature



        public Player(String name, int amountLife, int score, int XP) {
                this.name = name;
                this.amountLife = amountLife;
                Score = score;
                this.XP = XP;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAmountLife() {
                return amountLife;
        }

        public void setAmountLife(int amountLife) {
                this.amountLife = amountLife;
        }

        public int getScore() {
                return Score;
        }

        public void setScore(int score) {
                Score = score;
        }

        public int getXP() {
                return XP;
        }

        public void setXP(int XP) {
                this.XP = XP;
        }


}
