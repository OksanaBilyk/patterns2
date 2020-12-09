package net.basepatterns.creational.abstractfactory;

import net.basepatterns.creational.abstractfactory.banking.BankingTeamFactory;


public class SuperBankSystem {

	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		ProjectManager projectManager = projectTeamFactory.getProjectManager();

		developer.writeCode();
		tester.testCode();
		projectManager.manageProject();
	}

}
