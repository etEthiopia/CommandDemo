/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpatterndemo;

/**
 *
 * @author Dagi
 */
public class CommandPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TsomMeal tsom = new TsomMeal();
        Command tsomCommand = new TsomCommand(tsom);
        
        FisikMeal fisik = new FisikMeal();
        Command fisikCommand = new FisikCommand(fisik);
        
        MealInvoker mealInvoker = new MealInvoker(tsomCommand);
        mealInvoker.invoke();
        
        mealInvoker.setCommand(fisikCommand);
        mealInvoker.invoke();
    }
    
}
