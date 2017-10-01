package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private double baseTipPerBag;
    private int bagCount;
    private double tipPercent;

    public BaggageServiceTipCalculator(double tipPrecent, int bags) {
        setTipPercent(tipPrecent);
        setBagCount(bags);
        baseTipPerBag = 1.00; // set default value
    }

    @Override
    public final double getTip() {
        return baseTipPerBag * bagCount * (1 + tipPercent);
    }

    public final void setTipPercent(double tipPercent) {
        if(tipPercent < 0) throw new IllegalArgumentException("Tip Percent May Not Be Negitive");
        this.tipPercent = tipPercent;
    }

    public final double getTipPercent() {
        return tipPercent;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
