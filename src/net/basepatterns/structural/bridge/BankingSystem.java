package net.basepatterns.structural.bridge;

public class BankingSystem extends Program {

	protected BankingSystem(final Developer developer) {
		super(developer);
	}

	@Override
	public void developProgram() {
		System.out.println("Banking System development in progress...");
		developer.writeCode();
	}
}
