

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
/*
 * This class creates a menu of options that can be used while 
 * the program is running
 */
public class VendingMachineMenu 
{

	protected VendingMachineMenu()
	{
		
	}
	
	// initializes objects of outside classes.
//private Items item = new Items();
	
	// initializes strings used for menu selection.
	private String selection = "selection";
	private String operator = "operator";
	private String operatorPW = "password";
	private String getMoney = "recieve";
	private String inputMoney = "input";
	private String restockItems = "stock";
	private String takeMoney = "take";
	private int operatorMoney = 0;
	private int vendingMachineMoney = 0;
	private String userMoney;
	private String menuSelection;
	private int hamStock = 10;
	private int baconStock = 10;
	private int lambStock = 10;
	private int turkeyStock = 10;
	private int meatStock = 10;
	private int porkStock = 10;
	private int moneyAva = 0;
	private String meat = "meatloaf";
	private String ham = "ham";
	private String bacon = "bacon";
	private String lamb = "lamb";
	private String turkey = "turkey";
	private String pork = "pork";

	Scanner userCoins = new Scanner(System.in);
	Scanner menuSelectionStore = new Scanner(System.in);
	Scanner operatorPassword = new Scanner(System.in);
	Scanner menuSelection2Store = new Scanner(System.in);
	Scanner itemSelectionStore = new Scanner(System.in);
	Scanner itemSelection2Store = new Scanner(System.in);
	Scanner Quit = new Scanner(System.in);
	Scanner machineMoney = new Scanner(System.in);

	protected int User()
	{
		//promts the user for the amount of coins they have.
		System.out.print("Enter the amount of coins you have: ");
		userMoney = userCoins.nextLine();
		Integer uMoney = Integer.parseInt(userMoney);
		System.out.println("");
		
		return uMoney;
	}
	
	protected void Menu(int uMoney)
	{		
		
		
		// prints the user menu.
		System.out.println("");
		System.out.println(" ");
		System.out.println("Welcome to the Meat Machine Vending Machine.");
		System.out.println("Please choose an option below.");
		System.out.println("");
		System.out.println("To input coins please type 'input'.");
		System.out.println("To make a selection please type 'selection'.");
		System.out.println("To enter operator mode please type 'operator'.");
		System.out.println("To return your coins please type 'recieve'.");
	//	System.out.println("Use Q or q for quit.");
		System.out.println("");
		
		// prompts for menu selection.
		System.out.print("Menu Selection: ");
		// reads the users input.
		menuSelection = menuSelectionStore.nextLine();
		menuSelection = menuSelection.toLowerCase();
		
		if(menuSelection.equals(selection) || menuSelection.equals(operator)||
				menuSelection.equals(getMoney)|| menuSelection.equals(inputMoney));
		{
			//input money logic
			if(menuSelection.equals(inputMoney))
			{
				System.out.print("Input money: ");
				String money = machineMoney.nextLine();
				Integer inMoney = Integer.parseInt(money);
				
				uMoney -= inMoney;
				vendingMachineMoney += inMoney;
				moneyAva += inMoney;
				
				System.out.print("Total Money in: "+moneyAva);
				Menu(uMoney);
				
				
			}
			//selection logic
			if(menuSelection.equals(selection))
			{
				System.out.println("Please choose an item from the following choices.");
				System.out.println("");
				System.out.println("Ham, Leg of Lamb, Leg of Turkey, Meatloaf, Bacon, and Pork Chop");
				System.out.println("");
				System.out.println("Please use ham, lamb, turkey, meat, bacon, or pork for the above selections.");
				String itemSelection2 = itemSelection2Store.nextLine();
				
				if(itemSelection2.equals(meat) && moneyAva < 2 || itemSelection2.equals(pork) && moneyAva < 3 || itemSelection2.equals(bacon) && 
						moneyAva < 1 || itemSelection2.equals(lamb) && moneyAva < 5 || itemSelection2.equals(ham) && moneyAva < 4 || itemSelection2.equals(turkey) 
							&& moneyAva < 3)
				{
					System.out.println("You do not have enough coins. Please deposit more.");
					Menu(uMoney);
				}
				
				if(itemSelection2.equals(meat))
				{
					System.out.println("You have selected Meatloaf. 2 coins has been deducted from your input total.");
					moneyAva -= 2;
					meatStock -= 1;
					System.out.println("You have " +moneyAva+ " coins remaining.");
					Menu(uMoney);
				}
				else if(itemSelection2.equals(pork))
				{
					System.out.println("You have selected Pork Chops. 3 coins has been deducted from your input total.");
					moneyAva -= 3;
					porkStock -= 1;
					System.out.println("You have " +moneyAva+ " coins remaining.");
					Menu(uMoney);
				}
				else if (itemSelection2.equals(bacon))
				{
					System.out.println("You have selected Bacon. 1 coin has been deducted from your input total.");
					moneyAva -= 1;
					baconStock -= 1;
					System.out.println("You have " +moneyAva+ " coins remaining.");
					Menu(uMoney);
				}
				else if(itemSelection2.equals(lamb))
				{
					System.out.println("You have selected Leg of Lamb. 5 coins has been deducted from your input total.");
					moneyAva -= 5;
					lambStock -= 1;
					System.out.println("You have " +moneyAva+ " coins remaining.");
					Menu(uMoney);
				}
				else if(itemSelection2.equals(ham))
				{
					System.out.println("You have selected Ham. 4 coins has been deducted from your input total.");
					moneyAva -= 4;
					hamStock -= 1;
					System.out.println("You have " +moneyAva+ " coins remaining.");
					Menu(uMoney);
				}
				else if(itemSelection2.equals(turkey))
				{
					System.out.println("You have selected Leg of Turkey. 3 coins has been deducted from your input total.");
					moneyAva -= 3;
					turkeyStock -= 1;
					System.out.println("You have " +moneyAva+ " coins remaining.");
					Menu(uMoney);
				}
			}
			
			if(menuSelection.equals(getMoney))
			{
				uMoney += moneyAva;
				System.out.println("You recieved " +moneyAva+ " coins back.");
				moneyAva = 0;
				System.out.println("You have " +moneyAva+ " coins to spend.");
				Menu(uMoney);
			}
			//operator logic
			if(menuSelection.equals(operator))
			{
			System.out.print("Please input your operator password: ");
			String operatorPass = operatorPassword.nextLine();
			
			 if(operatorPass.equals(operatorPW))
			 {
				 operatorMenu(vendingMachineMoney, uMoney);
			 }
			}
		}
		}
			protected void operatorMenu(int vendingMachineMoney, int uMoney)
			{
				/*if(menuSelection.equals(operator))
				{
				System.out.println("Please input your operator password.");
				String operatorPass = operatorPassword.nextLine();
				
				 if(operatorPass.equals(operatorPW))*/
				 {
					//operator menu
					System.out.println("");
				 	System.out.println("Welcome to the Operator menu.");
				 	System.out.println("Please choose an option below.");
				 	System.out.println(" ");
				 	System.out.println("To take the total money out of the Machine please type 'take'.");
				 	System.out.println("To re stock a chosen item please type 'stock'.");
				 	System.out.println("To quit this menu type 'quit'.");
				 	System.out.println(" ");
				 	
				 	System.out.print("Menu Selection:  ");
				 	String menuSelection2 = menuSelection2Store.nextLine();
				 	
				 	// restock logic
				 	if(menuSelection2.equals(restockItems))
				 	{
				 		System.out.print("Please choose an item to restock: ");
				 		System.out.println(" ");
				 	
				 		System.out.println("Item Selection:  ");
				 		String itemSelection = itemSelectionStore.nextLine();
				 		
						if(itemSelection.equals(meat))
						{
							System.out.println("You have selected Meatloaf.");
							meatStock = 10;
							operatorMenu(vendingMachineMoney, uMoney);
						}
						else if(itemSelection.equals(pork))
						{
							System.out.println("You have selected Pork Chops.");
							porkStock = 10;	
							operatorMenu(vendingMachineMoney, uMoney);
						}
						else if (itemSelection.equals(bacon))
						{
							System.out.println("You have selected Bacon.");
							baconStock = 10;
							operatorMenu(vendingMachineMoney, uMoney);
						}
						else if(itemSelection.equals(lamb))
						{
							System.out.println("You have selected Leg of Lamb.");
							lambStock = 10;
							operatorMenu(vendingMachineMoney, uMoney);
						}
						else if(itemSelection.equals(ham))
						{
							System.out.println("You have selected Ham.");
							hamStock = 10;
							operatorMenu(vendingMachineMoney, uMoney);
						}
						else if(itemSelection.equals(turkey))
						{
							System.out.println("You have selected Leg of Turkey.");
							turkeyStock = 10;
							operatorMenu(vendingMachineMoney, uMoney);
						}
				 	}
				 	//get money logic
				 	else if(menuSelection2.equals(takeMoney))
				 	{
				 		operatorMoney += vendingMachineMoney;
				 		
				 		System.out.println("Total coins taken out: "+operatorMoney);
				 		operatorMenu(vendingMachineMoney, uMoney);
				 	}
				 
				 	
				 }
			}
		}
	

