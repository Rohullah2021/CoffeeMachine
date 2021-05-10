
public class OldCoffeeMachine implements CoffeeMachineInterface {
	private OldCoffeeMachine aOldVendingMachine;
	public CoffeeTouchscreenAdapter(OldCoffeeMachine oldVendingMachine) {
		aOldVendingMachinee = oldVendingMachine;
	}
	public void chooseFirstSelection() {
	aOldVendingMachine.selectFlavor1();
	}
	public void chooseSecondSelection() {
	aOldVendingMachine.selectFlavor2();
	
 }
}
