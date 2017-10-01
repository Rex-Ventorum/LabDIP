/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Brandon
 */
public class TipCalculatorService {
    public final double getTip(TipCalculator tipCal){
        if(tipCal == null) throw new IllegalArgumentException("Tip Calculator May Not Be Null");
        return tipCal.getTip();
    }
}
