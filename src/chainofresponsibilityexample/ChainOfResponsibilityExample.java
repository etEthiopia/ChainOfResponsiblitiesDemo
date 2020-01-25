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
public class ChainOfResponsibilityExample {

    /**
     * @param args the command line arguments
     */
    
    private static Chain createChain() {
        // Build the chain of responsibility
 
    	Chain chain1 = new ChainA(Chain.Three);
 
    	Chain chain2 = new ChainB(Chain.Two);
    	chain1.setNext(chain2);
 
        Chain chain3 = new ChainC(Chain.One);        
        chain2.setNext(chain3);
 
        return chain1;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Chain chain = createChain();
 
        chain.message("level 3", Chain.Three);
 
        chain.message("level 2", Chain.Two);
 
        chain.message("level 1", Chain.One);
    }
    
}
