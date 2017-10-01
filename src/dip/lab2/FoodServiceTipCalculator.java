package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private double bill;
    private double tipPercent; 
    
    public FoodServiceTipCalculator(double tipPercent, double billAmt) {
        setTipPercent(tipPercent);
        setBill(billAmt);
    }

    public final double getTip() {
        return bill * tipPercent;
    }

    public final void setBill(double billAmt) {
        if(billAmt < 0) {
            throw new IllegalArgumentException("Bill Amount May Not Be Negitive");
        }
        bill = billAmt;
    }

    public final double getBill(){
        return bill;
    }
    
    public final void setTipPercent(double tipPercent) {
        if(tipPercent < 0) throw new IllegalArgumentException("Tip Percent May Not Be Negitive");
        this.tipPercent = tipPercent;
    }

    public final double getTipPercent() {
        return tipPercent;
    }

}
