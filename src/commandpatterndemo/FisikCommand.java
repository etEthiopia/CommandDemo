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
public class FisikCommand implements Command {

    FisikMeal fisik;

    public FisikCommand(FisikMeal meal) {
        fisik = meal;
    }

    @Override
    public void execute() {
        fisik.makeFisikMeal();
    }
    
}
