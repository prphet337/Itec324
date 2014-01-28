import java.util.Scanner;
import java.util.Locale;

public class VendingMachine
{
    public static void main(String[]args)
    {
        String inputMoney = "Input";
        String operatorMode = "Operator";
        String operatorPassword = "String";
        String selection;
        String operatorRestock = "Restock";
        
        
        Scanner menuSelectionStore = new Scanner(System.in);
        Scanner Quit = new Scanner(System.in);
            
        // prints the User Menu.
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Welcome to the *filler* Vending Machine.");
        System.out.println("Please choose an option from the Menu below.");
        System.out.println(" ");
        System.out.println("Type 'Input' to put in money.");
        System.out.println("Type 'Operator' to enter Operator mode.");
        System.out.println("Type 'Quit' to leave the Vending Machine.");
        System.out.println(" ");
                               
        if(menuSelectionStore.equals(operatorMode))
        {
            //promts user for Operator Password if the Operator
            //mode option was chosen.
            System.out.print("Enter your Operator Password. ");
            Scanner OperatorPW = new Scanner(System.in);
        }
    
        if(operatorPassword.equals(operatorPassword))
        {
            //prints the Operator Menu.
            Scanner operatorMenuStore = new Scanner(System.in);
            System.out.println("Welcome to the Operator Menu.");
            System.out.println("Please choose an opion below.");
            System.out.println("");
            System.out.println("Type 'Restock' to choose an item to restock.");
            System.out.println("");
            
            if(operatorMenuStore.equals(operatorRestock))
            {
                System.out.println("Please select an item to restock.");
            }
        }

    }
}