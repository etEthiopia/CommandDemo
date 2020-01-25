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
public class TsomCommand implements Command {
    
    TsomMeal tsom;
    
    public TsomCommand(TsomMeal meal){
        tsom = meal;
    }
    
    @Override
    public void execute(){
        tsom.makeTsomMeal();
    }
}
