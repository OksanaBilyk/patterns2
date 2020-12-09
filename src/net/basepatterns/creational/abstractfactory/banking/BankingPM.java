package net.basepatterns.creational.abstractfactory.banking;

import net.basepatterns.creational.abstractfactory.ProjectManager;


public class BankingPM implements ProjectManager {

	@Override
	public void manageProject() {
		System.out.println("Banking PM manages banking project ...");
	}
}
