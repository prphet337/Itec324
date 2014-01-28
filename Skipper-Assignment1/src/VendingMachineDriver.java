
public class VendingMachineDriver 
{
	protected VendingMachineDriver()
	{
		
	}
	
	public static void main(String args[])
	{
		VendingMachineMenu startUp = new VendingMachineMenu();
		
		startUp.User();
		startUp.Menu(0);
	}
}
