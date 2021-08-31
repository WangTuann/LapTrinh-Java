
package PairOfDice;

public class PairofDice {

    public int die1;
    public int die2;
    private String diel;

    public PairofDice() {

        roll();
    }

    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6 + 1);
    }

    public int getDie1() {
        return die1;
    }

    public void setDie1(int value) {
        if (value < 1 || value > 6) {
            throw new IllegalArgumentException("Illegal dice value" + value);
            die1=value;
            
        }
    }

    public int getDie2() {
        return die2;
    }
    public String setDie2(int value){
        if (value<1||value>6) {
            throw new IllegalArgumentException("Illegal dice value"+value);
            die2=value;
        }

        public string toString(){
            if (die1==die2) {
                return "double"+diel;}
                else
                return die1+"and"+die2;
                
            }
        }
        
    }


