What is Command Pattern?

    Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undo of operations

Components

    1. Command

    2. FisikMeal

    3. TsomMeal

    4. FisikCommand

    5. TsomCommand

    6. MealInvoker

    7. CommandPatternDemo

1. Command

   The main Interface creating the structure the execute()

2. FisikMeal

   Meal which has makeFisikMeal(), the method that makes Fisik Meal.

3. TsomMeal

   Meal which has makeTsomMeal(), the method that makes Tsom Meal.

4. FisikCommand

   implements the 'Command' Interface with a constructor accepting a meal.

   Overrides execute() method to make a 'Fisik Meal'

5. TsomCommand

   implements the 'Command' Interface with a constructor accepting a meal.

   Overrides execute() method to make a 'Tsom Meal'

6. MealInvoker

   sets the command

   The method 'invoke' makes command execute.

7. CommandPatternDemo

   starts main method

   Instiating tsom Object
   Instiating tsomCommand with the tsom object

   Instiating fisik Object
   Instiating fisikCommand with the fisik object

   call the method 'invoke' on mealInvoker

   then setCommand to fiskCommand

   call the method 'invoke' on mealInvoker
