/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibilityexample;

/**
 *
 * @author Dagi
 */
public class ChainB extends Chain {
    public ChainB(int threshold) { 
        this.Threshold = threshold;
    }
 
    protected void writeMessage(String msg) {
        System.out.println("Chain B: " + msg);
    }
}
